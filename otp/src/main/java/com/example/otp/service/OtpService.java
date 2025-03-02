package com.example.otp.service;

import com.example.otp.rest.SendOtpRequest;
import com.example.otp.rest.SendOtpResponse;

public interface OtpService {
    SendOtpResponse sendOtp(SendOtpRequest sendOtpRequest);

}
