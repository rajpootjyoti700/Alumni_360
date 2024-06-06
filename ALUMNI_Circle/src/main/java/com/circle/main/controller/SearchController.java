package com.circle.main.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.circle.main.dao.ContactRepository;
import com.circle.main.dao.UserRepository;
import com.circle.main.entities.Contact;
import com.circle.main.entities.User;

@RestController
public class SearchController {
    
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping("/search/{query}")
	public ResponseEntity<?> search(@PathVariable("query") String query ,Principal principal){
		System.out.println(query);
		User user = this.userRepository.getUserByUserName(principal.getName());
		List<Contact> contacts = this.contactRepository.findByCompanyroleContainingAndUser(query, user);
		return ResponseEntity.ok(contacts);
	}
	
	@GetMapping("/search-user/{query}")
	public ResponseEntity<?> searchUserHandler(@PathVariable("query") String query ,Principal principal){
		System.out.println(query);
		User user = this.userRepository.getUserByUserName(principal.getName());
		List<User> users = this.userRepository.findByNameContaining(query);
		return ResponseEntity.ok(users);
	}
	
}
