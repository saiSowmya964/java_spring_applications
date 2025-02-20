package com.pace.springboot.controller;

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

import com.pace.springboot.model.Book;
import com.pace.springboot.service.BookService;

//mark class as Controller
@RestController
@RequestMapping("api/v1/library")
public class BookController {
//Autowire the BooksService class
	@Autowired
	BookService bookService;
	
	//creating a get mapping that retrieves all the books detail from the database 
		@GetMapping("/getallbooks")
		private List<Book> getAllBooks() {
			return bookService.getAllBooks();
		}
	
	//creating post mapping that post the book detail in the database
		@PostMapping("/addbook")
		private int saveBook(@RequestBody Book book) {
			bookService.saveBook(book);
			return book.getBookid(); 
			// book id will be sent to response body of postman after inserting book data
		}
		
//creating a get mapping that retrieves the detail of a specific book
		@GetMapping("/getbook/{bookid}")
		private Book getBooks(@PathVariable("bookid") int bookid) {
			return bookService.getBookById(bookid);
		}
	
	//creating put mapping that updates the book detail 
		@PutMapping("/updatebook")
		private Book update(@RequestBody Book book) {
			bookService.updateBook(book);
			return book;
		}

//creating a delete mapping that deletes a specified book
	@DeleteMapping("/deletebook/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid) {
		bookService.deleteBook(bookid);
	}

}
