package com.globallogic.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="user")
public class User {
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String username, String email, BookCategory bookcat) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.bookcat = bookcat;
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", bookcat="
				+ bookcat + "]";
	}

	public BookCategory getBookcat() {
		return bookcat;
	}

	public void setBookcat(BookCategory bookcat) {
		this.bookcat = bookcat;
	}

	
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int id;
	
	@Column
	String name;
	
	@Column
	String username;
	
	@Column
	String email;
	
	@OneToOne
	BookCategory bookcat;
	
}
