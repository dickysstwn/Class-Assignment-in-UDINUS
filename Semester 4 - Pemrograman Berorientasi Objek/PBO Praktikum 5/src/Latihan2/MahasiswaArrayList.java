package Latihan2;

import java.util.Scanner;
import java.util.ArrayList;

public class MahasiswaArrayList {
	static int n;
	static ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
	
	public static void main(String[] args) {
		System.out.print("Masukkan Jumlah Data: ");
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		
		String[] nim = new String[n];
		String[] nama = new String[n];
		Double[] ipk = new Double[n];
				
		for(int i = 0; i<n; i++) {
			System.out.println("Data ke-"+(i+1));
			System.out.print("Masukkan NIM : ");
			nim[i] = inp.next();
			System.out.print("Masukkan Nama: ");
			nama[i] = inp.next();
			System.out.print("Masukkan IPK : ");
			ipk[i] = inp.nextDouble();
		}
		
		setMahasiswa(nim, nama, ipk);
		cetakMahasiswa(mahasiswa);		
	}
	
	public static void setMahasiswa(String[] nim, String[] nama, Double[] ipk) {
		for(int i = 0; i<n; i++) {
			mahasiswa.add(new Mahasiswa(nim[i], nama[i], ipk[i]));
		}
	}
	
	public static void cetakMahasiswa(ArrayList<Mahasiswa> list) {
		for(int i = 0; i<n; i++) {
			System.out.println("=======================");
			System.out.println("Data ke-"+(i+1));
			System.out.println("NIM : "+list.get(i).nim);
			System.out.println("Nama: "+list.get(i).nama);
			System.out.println("IPK : "+list.get(i).ipk);
		}
	}
}