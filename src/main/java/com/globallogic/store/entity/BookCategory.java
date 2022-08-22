package com.globallogic.store.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="bookcategory")
public class BookCategory {
	public BookCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookCategory(int id, String categoryname, List<Book> book) {
		super();
		this.id = id;
		this.categoryname = categoryname;
		this.book = book;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	

	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", categoryname=" + categoryname + ", book=" + book + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int id;
	
	@Column
	String categoryname;
	
	@OneToMany
	List<Book> book;
}
