package com.globallogic.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.store.entity.BookCategory;

public interface BookCatRepo extends JpaRepository<BookCategory, Integer> {

}
