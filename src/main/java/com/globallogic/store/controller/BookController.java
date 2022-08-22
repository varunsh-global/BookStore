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

import com.globallogic.store.entity.Book;
import com.globallogic.store.repo.BookRepo;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookRepo brepo;
	
	@GetMapping("/")
	public List<Book> showBook() {
		return brepo.findAll();
		
	}
	
	@PostMapping("/")
	public List<Book> saveBook(@RequestBody Book book) {
		brepo.save(book);
		return brepo.findAll();
		
	}
	
	@PutMapping("/")
	public Book updateBook(@RequestBody Book book)
	{
		brepo.save(book);
		System.err.println(book);
		return book;
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") Long id)
	{
		System.err.println("deleted id is : "+id);
		brepo.deleteById(id);
		return "Record Has been deleted !";
	}
	
	@GetMapping("/author/{author}")
	public List<Book> getStudentbyAuthor(@PathVariable String author) {
		return brepo.findByAuthor(author);
		
		
	}
	@GetMapping("/name/{name}")
	public List<Book> getStudentbyName(@PathVariable String name) {
		return brepo.findByName(name);
		
		
	}
	
	@GetMapping("/name/{name}/author/{author}")
	public List<Book> getStudentbyNameAndAuthor(@PathVariable("name") String name ,@PathVariable("author") String author) {
		return brepo.findByNameAndAuthor(name,author);
		
		
	}
}
