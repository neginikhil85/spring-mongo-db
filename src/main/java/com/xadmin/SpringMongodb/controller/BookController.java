package com.xadmin.SpringMongodb.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringMongodb.collection.Book;
import com.xadmin.SpringMongodb.service.BookService;

@RestController 
@RequestMapping("/book")
public class BookController {

	private final BookService bookService;
	private CrudRepository repo;
	
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}

	@GetMapping
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}

	@PostMapping
	public String saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
		return "Added book with id: " + book.getId();
	}
	
	@PutMapping("/{id}")
	public String updateBook(@PathVariable("id") int id, @RequestBody Book book) {
		boolean idExist = bookService.updateBook(id, book);
		if (idExist) {
			return "Updated book with id:" + id;
		}
		return "id not found";
	}
	
	@DeleteMapping("/{id}")
	public String deleteBookById(int id) {
		bookService.deleteBookById(id);
		return "delete book with id:" + id;
	}
}
