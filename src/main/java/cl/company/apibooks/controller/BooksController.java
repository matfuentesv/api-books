package cl.company.apibooks.controller;

import cl.company.apibooks.model.Libro;
import cl.company.apibooks.service.BookService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
@Log
public class BooksController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Libro>> getAllMovies() {
        log.info("Se solicita la lista de todas las películas.");
         return ResponseEntity.ok(bookService.findAll());
    }
}
