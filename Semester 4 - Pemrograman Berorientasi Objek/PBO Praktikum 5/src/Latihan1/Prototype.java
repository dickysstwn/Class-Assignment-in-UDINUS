package Latihan1;

public class Prototype {
	int[] array;
	
	public void setArray(int[] data) {
		array = data;
	}
	
	public int sumOfArray() {
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public void cetakArray() {
		for(int i = 0; i<array.length; i++) {
			System.out.printf("%d,", array[i]);
		}
		System.out.println(" jumlah angka = "+sumOfArray());
	}
}
