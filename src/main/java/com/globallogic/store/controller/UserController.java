package com.globallogic.store.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.globallogic.store.entity.User;
import com.globallogic.store.entity.BookCategory;
import com.globallogic.store.repo.*;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepo urepo;
	
	@Autowired
	BookCatRepo bcatrepo;
	
	
	
	@GetMapping("/")
	public List<User> showUser() {
		return urepo.findAll();
		
	}
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
	 BookCategory entity=bcatrepo.findById(user.getBookcat().getId()).get();
	 
	 
	 user.setBookcat(entity);
	
	 urepo.save(user);
	 return user;
	 
	}
	@PutMapping("/")
	public User updateUser(@RequestBody User user)
	{
	
		
		urepo.save(user);
		System.err.println(user);
		return user;
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") Integer id)
	{
		System.err.println("deleted id is : "+id);
		urepo.deleteById(id);
		return "Record Has been deleted !";
	}
}
