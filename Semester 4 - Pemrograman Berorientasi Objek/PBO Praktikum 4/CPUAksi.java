package week4;

public class CPUAksi {
	public static void main(String[] args) {
		CPU intel = new CPU();
		CPU.Processor i7 =  intel.new Processor();
		CPU.RAM corsair = intel.new RAM();
		
		System.out.println("Processor Cahce = "+i7.getCache());
		System.out.println("Ram Clock Speed = "+corsair.getClockSpeed());
		
		
		
	}

}
class CPU {
	 double price;
	 // nested class
	 class Processor{
	 // members of nested class
	 double cores;
	 String manufacturer;
	 double getCache(){
	 return 4.3;
	 }
	 }
	 // nested protected class
	 protected class RAM{
	 // members of protected nested class
	 double memory;
	 String manufacturer;
	 double getClockSpeed(){
	 return 5.5;
	 }
	 }
	}
