package com.aulajpamaven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajpamaven.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
