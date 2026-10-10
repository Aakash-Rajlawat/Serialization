package com.aakash.jackson.binding;

import lombok.Data;

@Data
public class Book {

    private String title;
    private String author;
    private int bookId;
    private Author authorObj;

}
