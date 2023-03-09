package com.valid.excep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valid.excep.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	public User findByuserid(int id);
	

}
