package com.example.otp.rest;

import com.example.otp.service.OtpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("api/v1/otp")
@RestController
public class OtpController {
    private final OtpService otpService;
    @PostMapping
    public SendOtpResponse sendOtp(@RequestBody SendOtpRequest sendOtpRequest){
        return otpService.sendOtp(sendOtpRequest);
    }

}
