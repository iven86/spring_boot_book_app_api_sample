package com.example.books.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.books.exception.ResourceNotFoundException;
import com.example.books.model.Book;
import com.example.books.repository.BooksRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/")
public class BooksController {

	@Autowired
	private BooksRepository booksRepository;
	
	// get all books
	@GetMapping("/book")
	public List<Book> getAllBooks(){
		return booksRepository.findAll();
	}

	// create books rest api
	@PostMapping("/book")
	public Book createBooks(@RequestBody Book books) {
		return booksRepository.save(books);
	}
	
	// get books by id rest api
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBooksById(@PathVariable Long id) {
		Book books = booksRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));
		return ResponseEntity.ok(books);
	}
	
	// update books rest api
	
	@PutMapping("/book/{id}")
	public ResponseEntity<Book> updateBooks(@PathVariable Long id, @RequestBody Book booksDetails){
		Book books = booksRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));
		
		books.setBookName(booksDetails.getBookName());
		books.setBookCategory(booksDetails.getBookCategory());
		books.setBookPrice(booksDetails.getBookPrice());
		
		Book updatedBooks = booksRepository.save(books);
		return ResponseEntity.ok(updatedBooks);
	}
	
	// delete books rest api
	@DeleteMapping("/book/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteBooks(@PathVariable Long id){
		Book books = booksRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));
		
		booksRepository.delete(books);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}