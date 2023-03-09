package com.valid.excep.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valid.excep.dto.UserRequest;
import com.valid.excep.entity.User;
import com.valid.excep.exception.UserNotFoundException;
import com.valid.excep.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService us;
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest ur){
		
		ResponseEntity<User> user = new ResponseEntity<User>(us.saveUser(ur), HttpStatus.CREATED);
		
		return user;
		
	}
	
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException{
		
		ResponseEntity<User> rs = new ResponseEntity<User>(us.getUser(id), HttpStatus.OK);
		
		return rs;
		
		
		
		
		
	}
	

}
