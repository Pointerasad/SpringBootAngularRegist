package com.asad.registration.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asad.registration.app.entity.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
