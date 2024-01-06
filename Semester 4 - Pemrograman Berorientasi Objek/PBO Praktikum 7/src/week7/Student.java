package week7;

// Child Class
public class Student extends Person {
	String nim;

	// Child Method
	public String getNim() {
		return nim;
	}

	@Override
	public void identity() {
		super.identity();
		System.out.println("NIM: " + getNim());
	}

	// Method Pembayaran
	public int hitungPembayaran(int spp, int sks, int modul) {
		int total = 0;

		total += spp + sks + modul;

		return total;
	}
}
