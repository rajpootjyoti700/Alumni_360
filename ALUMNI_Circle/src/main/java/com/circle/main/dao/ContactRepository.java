package com.circle.main.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.circle.main.entities.Contact;
import com.circle.main.entities.User;

public interface ContactRepository extends JpaRepository<Contact, Integer>{
    
	@Query("from Contact c where c.user.id = :userId")
	// Current Page - page
	// Contacts per page 
	public Page<Contact> findContactsByUserId(@Param("userId")int userId, Pageable pageable);
	
	public List<Contact> findByCompanyroleContainingAndUser(String name, User user);
	
	public List<Contact> findByUser(User user);
}
