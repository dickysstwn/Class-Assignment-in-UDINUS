package soal3;

public class Journal extends Book {
	int isbn;
	String type;
	
	public int getIsbn() {
		return setIsbn(isbn);
	}
	
	public String getType() {
		return setType(type);
	}
	
	public int setIsbn(int isbn) {
		this.isbn = isbn;
		return this.isbn;
	}
	
	public String setType(String type) {
		this.type = type;
		return this.type;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("ISBN: " + isbn);
	}
}
