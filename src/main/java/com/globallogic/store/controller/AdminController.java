package com.globallogic.store.controller;

import java.util.ArrayList;
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

import com.globallogic.store.entity.Admin;

import com.globallogic.store.entity.User;
import com.globallogic.store.repo.AdminRepo;
import com.globallogic.store.repo.UserRepo;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminRepo arepo;
	
	@Autowired
	UserRepo urepo;
	
	
	@GetMapping("/")
	public List<Admin> showAdmin() {
		return arepo.findAll();
		
	}
	
	@PostMapping("/")
	public Admin saveAdmin(@RequestBody Admin admin) {
		List<User> user=new ArrayList<>();
		for(User a:admin.getUser()) {
			User use=urepo.findById(a.getId()).get();
			user.add(use);
		}
		admin.setUser(user);
		arepo.save(admin);
		return admin;
	}
	
	@PutMapping("/")
	public Admin updateAdmin(@RequestBody Admin admin)
	{
	
		
		arepo.save(admin);
		System.err.println(admin);
		return admin;
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") Long id)
	{
		System.err.println("deleted id is : "+id);
		arepo.deleteById(id);
		return "Record Has been deleted !";
	}

}
