package Latihan1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int jmlData;
		Scanner input = new Scanner(System.in);
		Prototype A = new Prototype();
		
		System.out.print("Masukkan jumlah data: ");
		jmlData = input.nextInt();
		
		int[] data = new int[jmlData];
		
		for(int i=0; i<jmlData; i++) {
			System.out.print("Masukkan angka ke-"+(i+1)+": ");
			data[i] = input.nextInt();
		}
		
		A.setArray(data);
		A.cetakArray();
	}
}
