package com.valid.excep.service;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.excep.dto.UserRequest;
import com.valid.excep.entity.User;
import com.valid.excep.exception.UserNotFoundException;
import com.valid.excep.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
public User saveUser(UserRequest ur) {
	
	User u = User.builder()
			.age(ur.getAge())
			.emailid(ur.getEmailid())
			.gender(ur.getGender())
			.mobile(ur.getMobile())
			.name(ur.getName())
			.nationality(ur.getNationality())
			.build();
	User u1= userRepo.save(u);
	
	return u1;
	
}

 public User getUser(int id) throws UserNotFoundException {
	 
	User u = userRepo.findByuserid(id);
	
	if (u!=null) {
		
		return u;
		
	} else {
		
		throw new UserNotFoundException("userid not found");

	}
	 
	 

	 
	 
	 
 }
	

}
