package com.aulajpamaven.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulajpamaven.course.entities.Payment;
import com.aulajpamaven.course.repositories.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository repository; 
	
	public List<Payment> findAll(){
		return repository.findAll();
	}
	
	public Payment findById(Long id) {
		return repository.findById(id).get();
	}

}
