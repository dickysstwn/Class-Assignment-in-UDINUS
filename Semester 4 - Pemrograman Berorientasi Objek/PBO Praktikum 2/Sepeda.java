package week2;

public class Sepeda {
		private String jenis;
		private String merk;
		private int jumlahRoda;
		
		public Sepeda(int jumlahRoda, String jenis, String merk) {
			this.jumlahRoda = jumlahRoda;
			this.jenis = jenis;
			this.merk = merk;
		}
		

		public void info() {
			System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
			System.out.println("Jumlah gear 5");
		}
		
		public void info1() {
			System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
			System.out.println("Jumlah gear 3");
		}
		
		//ini adalah atribut
		int gear = 5;
		
		//ini adalah method
		void ngerem() {
			System.out.println("Sepeda direm");
		}

}
