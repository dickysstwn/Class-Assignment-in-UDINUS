package main;

import mahasiswa.Mahasiswa;

public class Main {
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("A11.2020.13089", "Dicky Setiawan", 3.91, 24, "2002-12-06");
		
		
		System.out.println("Program Studi : " + mhs.getProgdi("A11"));
		System.out.println("Status : " + mhs.ipkStatus());
		System.out.println("Tahun Angkatan : " + mhs.getTahun());
		System.out.println("Tagihan SKS : " + mhs.getTagihanSks());
		System.out.println("Semester : " + mhs.getMhsSemester());
		System.out.println("Umur : " + mhs.getUmur());
	}
}
