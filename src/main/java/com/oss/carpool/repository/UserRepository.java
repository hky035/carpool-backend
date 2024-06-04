package com.oss.carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oss.carpool.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
