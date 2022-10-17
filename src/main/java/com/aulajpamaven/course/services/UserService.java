package com.aulajpamaven.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.aulajpamaven.course.entities.User;
import com.aulajpamaven.course.repositories.UserRepository;
import com.aulajpamaven.course.services.exceptions.DatabaseException;
import com.aulajpamaven.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id){
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		User user = userRepository.getReferenceById(id);
		updateData(user,obj);
		return userRepository.save(user);
	}

	private void updateData(User user, User obj) {
		user.setEmail(obj.getEmail());
		user.setName(obj.getName());
		user.setPhone(obj.getPhone());
		
	}

}
