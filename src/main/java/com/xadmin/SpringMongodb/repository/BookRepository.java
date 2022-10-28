package com.xadmin.SpringMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.xadmin.SpringMongodb.collection.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
