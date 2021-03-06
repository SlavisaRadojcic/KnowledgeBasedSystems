package com.sbnz.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.doctor.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

	public User getUserByUserUsername(String username);

}
