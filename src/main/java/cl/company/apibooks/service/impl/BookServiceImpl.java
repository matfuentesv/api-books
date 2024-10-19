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

    @Override
    public Libro findBook(Long id) {
        if(bookRepository.findById(id).isPresent()){
            return bookRepository.findById(id).get();
        } else {
            return new Libro();
        }

    }

    @Override
    public Libro createBook(Libro book) {
        return bookRepository.save(book);
    }

    @Override
    public Libro updateBook(Libro book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
