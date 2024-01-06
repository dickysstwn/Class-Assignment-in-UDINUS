package mahasiswa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
	String nim;
	String nama;
	Double ipk;
	int sks;
	String tglLahir;

	public Mahasiswa(String nim, String nama, Double ipk, int sks, String tglLahir) {
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
		this.sks = sks;
		this.tglLahir = tglLahir;
	}

	public String getProgdi(String progdi) {
		String ps = "";
		if (progdi == "A11") {
			ps = "Teknik Informatika";
		} else if (progdi == "A12") {
			ps = "Sistem Informasi";
		} else if (progdi == "B11") {
			ps = "Manajemen";
		} else if (progdi == "B12") {
			ps = "Akuntansi";
		} else {
			ps = "Belum terdaftar";
		}

		return ps;
	}

	public String ipkStatus() {
		String stat = "";
		/**
		 * jika 0 < ipk <=1 , maka stat = "Perlu usaha lebih"
		 * jika 1 < ipk <=2, maka stat = "Perlu segera menaikkan IPK"
		 * jika 2 < ipk <=2.75, maka stat = "Sedikit lagi"
		 * jika 2.75 < ipk <= 3, maka stat = "Memuaskan"
		 * jika 3 < ipk <= 3.5, maka stat = "Sangat Memuaskan
		 * jika 3.5 < ipk <=4, maka stat = "Dengan pujian"
		 * jika di atas 4, maka stat = "Range ipk di luar jalur" 
		 * 
		 * */
		if (ipk > 0 && ipk <= 1) {
			stat = "Perlu usaha lebih";
		} else if (ipk > 1 && ipk <= 2) {
			stat = "Perlu segera menaikkan IPK";
		} else if (ipk > 2 && ipk <= 2.75) {
			stat = "Sedikit lagi";
		} else if (ipk > 2.75 && ipk <= 3) {
			stat = "Memuaskan";
		} else if (ipk > 3 && ipk <= 3.5) {
			stat = "Sangat Memuaskan";
		} else if (ipk > 3.5 && ipk <= 4) {
			stat = "Dengan Pujian";
		} else {
			stat = "Range ipk di luar jalur";
		}

		return stat;
	}

	public int getTahun() {
		/**
		 * cari angkatan dari nim yang diinput 
		 * misal A11.2000.00001, maka akan mengembalikan 2000
		 * 
		 */
		String x = this.nim.replace('.', ' ');
		String[] arrOfStr = x.split(" ");

		int angkatan = Integer.parseInt(arrOfStr[1]);

		return angkatan;
	}

	public int getTagihanSks() {
		/**
		 * cari berapa jumlah tagihan mahasiswa yang bersangkutan 
		 * sks*perSks
		 */
		int perSks = 250000;

		int tagihan = this.sks * perSks;

		return tagihan;
	}

	public int getMhsSemester() {
		/**
		 * Hitung mahasiswa sudah berapa semester kuliah
		 */

		int smt = 0;
		Calendar kld = Calendar.getInstance();
		int thnSkr = kld.get(Calendar.YEAR);
		int blnSkr = kld.get(Calendar.MONTH);
		int temp = 0;

		if (blnSkr > 6) {
			temp = 3;
		} else {
			temp = 2;
		}

		int thnAwal = getTahun();
		int selisih = thnSkr - thnAwal - 1;
		smt = (selisih * 2) + temp;

		return smt;
	}

	private Date dateFormatter(String pola, String tanggal) {
		Date tgl = null;
		SimpleDateFormat formatter = new SimpleDateFormat(pola);

		try {
			tgl = formatter.parse(tanggal);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return tgl;
	}

	public String getUmur() {

		/**
		 * Hitung umur di sini
		 */
		String umur = "Hello";
		String[] arrOfStr = this.tglLahir.split("-");

		Calendar kld = Calendar.getInstance();
		int thnSkr = kld.get(Calendar.YEAR);
		int thnLahir = Integer.parseInt(arrOfStr[0]);
		int calUmur = thnSkr % thnLahir;
		umur = String.valueOf(calUmur);
		return umur;

	}
}
