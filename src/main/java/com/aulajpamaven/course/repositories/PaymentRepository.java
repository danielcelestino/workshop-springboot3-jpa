package com.aulajpamaven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajpamaven.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
