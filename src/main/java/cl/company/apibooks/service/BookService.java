package cl.company.apibooks.service;

import cl.company.apibooks.model.Libro;

import java.util.List;

public interface BookService {

    List<Libro> findAll();

}
