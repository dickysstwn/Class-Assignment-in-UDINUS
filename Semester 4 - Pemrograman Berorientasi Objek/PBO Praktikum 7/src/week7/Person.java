package week7;

// Parent Class (Superclass)
public class Person {
	// Parent Atribute
	protected String name;
	protected String address;

	// Parent Method
	public void identity() {
		System.out.println("Nama: " + name);
		System.out.println("Alamat: " + address);
	}

	public void getHobi(String hobi) {
		System.out.println("Hobimu adalah: " + hobi);
	}
}
