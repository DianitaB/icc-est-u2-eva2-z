package controllers;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Book;

public class LibroController {
    public Map<Book, Book> procesarLibros(List<Book> libros) {
    Map<Book, Book> mO = new TreeMap<>();
    for (Book libro : libros) {
        mO.put(libro, libro);
    }
    return mO;
    }
}
