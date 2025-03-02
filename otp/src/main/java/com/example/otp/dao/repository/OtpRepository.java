package com.example.otp.dao.repository;

import com.example.otp.dao.entity.OtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OtpRepository extends JpaRepository<OtpEntity,Long> {
    Optional<OtpEntity> findByMsisdn (String msisdn);

    void findByMsisdn();
}
