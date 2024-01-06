package week4;

class MotherBoard {
 static class USB{
	 int usb2 = 1;
	 int usb3 = 2;
 int getTotalPorts(){
return usb2 + usb3;
 }
 }
}
public class MotherBoardAksi {
 public static void main(String[] args) {
 MotherBoard.USB usbMain = new MotherBoard.USB();
 
 System.out.println(usbMain.usb2);
 System.out.println(usbMain.usb3);
 System.out.println("Total Ports = "+usbMain.getTotalPorts());
 
 
 }
}
