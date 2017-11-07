package com.nayema.springexercises.exercise_01.controllers;

import com.nayema.springexercises.exercise_01.models.Book;
import com.nayema.springexercises.exercise_01.models.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class BooksController {

    @GetMapping("/")
    public String index(Model model) {
        ArrayList<Book> books = BookRepository.getBookList();

        model.addAttribute("books", books);
        return "exercise_01/books/index";
    }

    @GetMapping("/new")
    public String newBook(Model model) {
        model.addAttribute("book", new Book());
        return "exercise_01/books/new";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute Book book) {
        BookRepository.persistBook(book);

        return "redirect:/";
    }
}
