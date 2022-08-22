package com.globallogic.store.repo;

import com.globallogic.store.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookRepo extends JpaRepository<Book, Long>{
	 public List<Book> findByAuthor(String author);

		public List<Book> findByName(String name);

		public List<Book> findByNameAndAuthor(String name, String author);
}
