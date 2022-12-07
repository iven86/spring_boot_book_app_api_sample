package com.example.books;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.example.books.model.Book;
// import com.example.books.model.BookDetials;
// import com.example.books.repository.BooksRepository;


@SpringBootApplication
public class BooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

}


// @SpringBootApplication
// public class BooksApplication implements CommandLineRunner{

// 	public static void main(String[] args) {
// 		SpringApplication.run(BooksApplication.class, args);
// 	}
	
	// @Autowired
    // private BooksRepository booksRepository;

    // @Override
	// public void run(String... args) throws Exception {

    //     Book book = new Book(0, "aaa", "aaa", "10");

    //     BookDetials bookDetail = new BookDetials(0, "22445588", "The 100");

    //     // associate the objects
    //     book.setBookDetials(bookDetail);

    //     booksRepository.save(book);
    // }
// }
