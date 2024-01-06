package soal3;

import java.util.GregorianCalendar;

public class Book extends Item {
	String author;
	int pages;
	String publisher;
	int MAX_BORROWED_DAY = 14;
	
	GregorianCalendar date = new GregorianCalendar();
	
	public void dueDate(GregorianCalendar borrowDate) {
		System.out.println(borrowDate);
	}
	
	@Override
	public void print() {
		System.out.println("Title: " + super.title);
		System.out.println("Author: " + author);
		System.out.println("Publisher: " + publisher);
	}
}

