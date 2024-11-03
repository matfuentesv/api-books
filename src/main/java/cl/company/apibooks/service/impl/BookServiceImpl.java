package cl.company.apibooks.service.impl;

import cl.company.apibooks.model.Book;
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
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBook(Long id) {
        if(bookRepository.findById(id).isPresent()){
            return bookRepository.findById(id).get();
        } else {
            return new Book();
        }

    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
