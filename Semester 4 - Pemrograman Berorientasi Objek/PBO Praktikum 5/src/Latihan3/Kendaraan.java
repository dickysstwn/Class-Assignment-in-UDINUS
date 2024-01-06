package Latihan3;

public class Kendaraan {
	//attribute
	int roda;
	String warna;
	String merk;
	
	public Kendaraan (int roda, String warna, String merk) {
		this.roda = roda;
		this.warna = warna;
		this.merk = merk;
	}
	
	public void infoKendaraan () {
		System.out.printf("Roda: %d, Warna: %s, Merk: %s", roda, warna, merk);
	}
}