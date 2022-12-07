package com.example.books.repository;

import com.example.books.model.BookDetials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BookDetialsRepository extends JpaRepository<BookDetials, Long>{

}