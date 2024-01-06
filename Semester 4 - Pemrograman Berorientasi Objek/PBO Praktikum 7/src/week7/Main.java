package week7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student mahasiswa = new Student();

		System.out.print("Masukkan nama anda: ");
		String nama = scanner.nextLine();

		System.out.print("Masukkan alamat anda: ");
		String alamat = scanner.nextLine();

		System.out.print("Masukkan NIM anda: ");
		String nim = scanner.nextLine();

		System.out.print("Hobby anda: ");
		String hobi = scanner.nextLine();

		System.out.print("Uang SPP: ");
		int spp = scanner.nextInt();

		System.out.print("Uang SKS: ");
		int sks = scanner.nextInt();

		System.out.print("Uang Modul: ");
		int modul = scanner.nextInt();

		mahasiswa.address = alamat;
		mahasiswa.name = nama;
		mahasiswa.nim = nim;
		// Pemanggilan method dari superclass
		mahasiswa.getHobi(hobi);

		// Pemanggilan method dari subclass
		mahasiswa.identity();
		int tagihan = mahasiswa.hitungPembayaran(spp, sks, modul);
		System.out.println("Tagihan perkuliahan anda: " + tagihan);
	}
}
