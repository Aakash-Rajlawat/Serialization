package com.aakash.jackson.main;

import com.aakash.jackson.binding.Author;
import com.aakash.jackson.binding.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class javaToJson {

    public static void main(String[] args) throws IOException {
        Book book = new Book();
        Author a1 = new Author();
        book.setBookId(1);
        book.setAuthor("Hari");
        book.setTitle("Hari's Life");
        a1.setEmail("hari@example.com");
        a1.setFirstName("Hari");
        a1.setLastName("Sharma");
        a1.setPhone(1234567890);
        book.setAuthorObj(a1);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("book.json"), book);
        System.out.println("Json conversion successful");

    }
}
