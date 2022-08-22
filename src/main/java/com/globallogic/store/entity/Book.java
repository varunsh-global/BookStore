package com.globallogic.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column
	String title;
	@Column
	String author;
	@Column
	String publisher;
	@Column
	String description;
	int inStockNumber;
		


	public Book() {
		super();
	}



	public Book(Long id, String title, String author, String publisher, String description, int inStockNumber) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.description = description;
		this.inStockNumber = inStockNumber;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getInStockNumber() {
		return inStockNumber;
	}



	public void setInStockNumber(int inStockNumber) {
		this.inStockNumber = inStockNumber;
	}
	
}
