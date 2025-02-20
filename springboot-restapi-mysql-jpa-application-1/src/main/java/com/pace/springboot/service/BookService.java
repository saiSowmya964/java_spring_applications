package com.pace.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pace.springboot.model.Book;
import com.pace.springboot.repository.IBookRepository;

//defining the business logic
@Service
public class BookService {
	@Autowired
	IBookRepository booksRepository;

	// getting all books record by using the method findAll() of CrudRepository
	public List<Book> getAllBooks() {
		List<Book> bookList;

		bookList = (List<Book>) booksRepository.findAll();
		for (Book book : bookList) {
			System.out.println(book.getBookname());
		}
		return bookList;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Book getBookById(int id) {
		return booksRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveBook(Book book) {
		booksRepository.save(book);
	}

	// updating a record
	public void updateBook(Book book) {
		booksRepository.save(book);
	}

	//deleting a specific record by using the method deleteById() of CrudRepository
	public void deleteBook(int id) {
		booksRepository.deleteById(id);
	}

}