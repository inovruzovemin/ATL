package com.example.otp.service.impl;

import com.example.otp.client.SmsClient;
import com.example.otp.dao.entity.OtpEntity;
import com.example.otp.dao.repository.OtpRepository;
import com.example.otp.rest.SendOtpRequest;

import com.example.otp.rest.SendOtpResponse;
import com.example.otp.service.OtpService;
import com.example.otp.util.enums.OtpStatus;
import com.example.otp.util.helper.OtpGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class OtpServiceImpl implements OtpService {
    private final OtpRepository otpRepository;
    private final OtpGenerator otpGenerator;
    private final SmsClient smsClient;


    @Override
    public SendOtpResponse sendOtp(SendOtpRequest sendOtpRequest) {
        var otpEntity = otpRepository.findByMsisdn(sendOtpRequest.msisdn());
        if (otpEntity.isPresent()) {
            var otpData = otpEntity.get();
            if (otpData.getStatus().equals(OtpStatus.BLOCK)) {
                if (otpData.getBlockTime().isAfter(LocalDateTime.now())) {
                    // user waiting, return block expire time, return status
                    return null;
                } else {
                    //send otp,smscount change to 1, status set pending,
                    return null;
                }
            } else {
                if (otpData.getSmsCount() >= 5) {
                    //set block status
                    return null;
                } else {
                    // sms send, sendCount +1; statusu pending set et
                    return null;
                }
            }

        } else {
            // first time otp request
            var entity = sendOtpFirstTime(sendOtpRequest.msisdn());
            sendOtpResponse(entity);
            return null;

        }
    }

    private OtpEntity sendOtpFirstTime(String msisdn) {
        var code = otpGenerator.generate();
        var entity = OtpEntity.builder()
                .otpCode(code)
                .msisdn(msisdn)
                .status(OtpStatus.PENDING)
                .smsCount(1)
                .expireTime(LocalDateTime.now().plusMinutes(5))
                .build();
        return otpRepository.save(entity);
    }

    private SendOtpResponse sendOtpResponse(OtpEntity entity) {
        return new SendOtpResponse(entity.getStatus(), entity.getExpireTime(), entity.getBlockTime());
    }
}



