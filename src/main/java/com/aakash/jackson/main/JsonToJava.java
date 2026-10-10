package com.aakash.jackson.main;

import com.aakash.jackson.binding.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonToJava {
    public static void main(String[] args) throws IOException {
        File jsonFile = new File("book.json");

        ObjectMapper mapper = new ObjectMapper();
        Book book = mapper.readValue(jsonFile, Book.class);
        System.out.println(book);
    }
}
