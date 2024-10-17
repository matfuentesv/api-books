package cl.company.apibooks.service.impl;

import cl.company.apibooks.model.Libro;
import cl.company.apibooks.repository.BookRepository;
import cl.company.apibooks.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Libro> findAll() {
        return bookRepository.findAll();
    }
}
