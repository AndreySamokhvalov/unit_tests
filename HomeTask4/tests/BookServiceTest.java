

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Test
    void shouldReturnBookById() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book("1", "Title", "Author");

        when(bookRepository.findById("1")).thenReturn(book1);

   
        assertThat(bookService.findBookById("1")).isEqualTo(book1);
      
        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    void shouldReturnAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        List<Book> books = new ArrayList<>();
        Book book1 = new Book("1", "Title1", "Author1");
        Book book2 = new Book("2", "Title2", "Author2");
        books.add(book1);
        books.add(book2);

        when(bookRepository.findAll()).thenReturn(books);

        assertThat(bookService.findAllBooks()).isEqualTo(books);
        assertThat(bookService.findAllBooks().size()).isEqualTo(2);
    }



}
