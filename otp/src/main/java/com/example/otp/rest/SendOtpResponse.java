package com.example.otp.rest;

import com.example.otp.util.enums.OtpStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;

public record SendOtpResponse (OtpStatus otpStatus,
                               @JsonIgnore LocalDateTime expireTime,
                               @JsonIgnore LocalDateTime blockTime) {
}
