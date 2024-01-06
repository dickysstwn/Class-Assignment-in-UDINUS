package tugas1;

public class volume {
	
	public static void main(String[] args) {
		int diameter = 5;
		int tinggi = 10;
		double phi = 3.14;
		double volumeTabung = 0.25 * phi * (diameter * diameter) * tinggi;
		System.out.println("Volume tabung dengan diketahui diameter = 5, tinggi = 10 adalah" + volumeTabung);
	}
}
