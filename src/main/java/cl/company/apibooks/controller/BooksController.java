package cl.company.apibooks.controller;

import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
@Log
public class BooksController {

    @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllMovies() {
        log.info("Se solicita la lista de todas las películas.");
         return ResponseEntity.ok("Hola Mundo");
    }
}
