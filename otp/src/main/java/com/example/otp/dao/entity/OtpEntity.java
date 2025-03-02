package com.example.otp.dao.entity;

import com.example.otp.util.enums.OtpStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class OtpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private OtpStatus status;

    private String otpCode;
    private String msisdn;
    private Integer smsCount;


    private LocalDateTime expireTime;
    private LocalDateTime blockTime;
    @CreatedDate
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;


}
