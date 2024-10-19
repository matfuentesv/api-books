package cl.company.apibooks.service;

import cl.company.apibooks.model.Libro;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Libro> findAll();
    Libro findBook(Long id);
    Libro createBook(Libro book);
    Libro updateBook(Libro book);
    void deleteBook(Long id);

}
