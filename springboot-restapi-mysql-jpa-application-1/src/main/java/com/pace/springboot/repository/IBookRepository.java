package com.pace.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//repository that extends CrudRepository

import com.pace.springboot.model.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {
	
}
