package com.example.books.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "book_name")
	private String bookname;

	@Column(name = "book_category")
	private String bookcategory;
	
	@Column(name = "book_price")
	private String bookprice;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "description_id", referencedColumnName = "id")
    private BookDetials bookdetials;
	
	public Book() {
		
	}
	
	public Book(long id, String bookname, String bookcategory, String bookprice) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.bookcategory = bookcategory;
		this.bookprice = bookprice;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookname;
	}
	public void setBookName(String bookname) {
		this.bookname = bookname;
	}
	public String getBookCategory() {
		return bookcategory;
	}
	public void setBookCategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}
	public String getBookPrice() {
		return bookprice;
	}
	public void setBookPrice(String bookprice) {
		this.bookprice = bookprice;
	}

	public BookDetials getBookDetials() {
		return bookdetials;
	}
	public void setBookDetials(BookDetials bookdetials) {
		this.bookdetials = bookdetials;
	}
}