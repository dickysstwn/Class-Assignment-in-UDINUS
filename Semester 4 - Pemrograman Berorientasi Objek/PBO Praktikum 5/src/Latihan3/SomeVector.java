package Latihan3;

import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;

public class SomeVector {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int roda;
		String warna, merk;
		
		Vector<String> mamalia = new Vector<>();
		Vector<String> unggas = new Vector<>();
		Vector<Integer> i = new Vector<>();
		Vector<Kendaraan> k = new Vector<>();
		
		for(int j = 0; j<2; j++) {
			System.out.print("Jumlah roda kendaraan "+(j+1)+": ");
			roda = sc.nextInt();
			System.out.print("Warna kendaraan "+(j+1)+": ");
			warna = sc.next();
			System.out.print("Merk kendaraan "+(j+1)+": ");
			merk = sc.next();
			k.add(new Kendaraan(roda, warna, merk));
		}
		for(int j = 0; j<2; j++) {
			System.out.println("\n=========");
			System.out.println("Kendaraan "+(j+1));
			k.get(j).infoKendaraan();			
		}
		System.out.println();
		
		mamalia.add("Kucing");//0
		mamalia.add("Sapi");//1
		mamalia.add("Kuda");//2
		unggas.add("Bebek");//0
		unggas.add("Ayam");//1
		unggas.add(1,"Elang");
		System.out.println(mamalia.get(2));
		System.out.println(unggas);
		Vector<String> hewan = new Vector<>();
		hewan.addAll(mamalia);
		hewan.add("Platipus");//0
		hewan.addAll(unggas);
		System.out.println(hewan);
		
		hewan.set(3, "Buaya");		
		System.out.println(hewan);
		Iterator<String> iterate = hewan.iterator();
		System.out.println("Isi Vektor: ");
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.println("");
		for(int j = 0;j < hewan.size(); j++)
		{
			System.out.print(hewan.get(j)+", ");
		}
		
		String element = hewan.remove(2);
		System.out.println("");
		System.out.println("Elemen yang dihapus adalah "+element);
		System.out.println(hewan);
		hewan.clear();
		System.out.println(hewan);
	}
}