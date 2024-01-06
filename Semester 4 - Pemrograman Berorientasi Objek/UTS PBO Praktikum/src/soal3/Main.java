package soal3;

public class Main {
	public static void main(String[] args) {
		
		Journal journal = new Journal();
		
		journal.title = "Pengaruh Gawai pada Kehidupan Anak-anak";
		journal.author = "Sahrul Yudha";
		journal.publisher = "SMedia";
		journal.isbn = 13022;
		System.out.println("          Informasi Journal   ");
		journal.print();
		
		
//		Novel novel= new Novel();
//		novel.title = "Laskar Pelangi";
//		novel.author = "Andrea Hirata";
//		novel.publisher = "Bentang Pustaka";
//		novel.isbn = 97930;
//		novel.genre = "Roman";
//		System.out.println("         Informasi Novel   ");
//		novel.print();
		
//		Magazine magazine= new Magazine();
//		magazine.title = "The Economist";
//		magazine.author = "Crown Publishing";
//		magazine.publisher = "Kompas Utara";
//		magazine.volume = 121212;
//		magazine.type = "Politik";
//		System.out.println("         Informasi Majalah   ");
//		magazine.print();
	}
}

