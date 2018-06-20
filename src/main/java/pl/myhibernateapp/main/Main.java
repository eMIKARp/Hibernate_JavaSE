package pl.myhibernateapp.main;

import pl.myhibernateapp.dao.BookDao;
import pl.myhibernateapp.dao.BookDaoImpl;
import pl.myhibernateapp.model.Book;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("223456789","Wilk z Wall Street","Jordan Belford");
		BookDao bookDao = new BookDaoImpl();
		bookDao.save(book);
		System.out.println("Book saved");
		
		Book bookFromDb = bookDao.get(1L);
		System.out.println(bookFromDb);
		bookDao.cleanUp();
	}

}
