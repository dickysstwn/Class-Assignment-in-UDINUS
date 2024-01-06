package soal3;

import java.text.SimpleDateFormat;

public class Item {
	String title;
	boolean borrowed;
	
	int year, month, dayOfMonth;
	
	public void getTime() {
		SimpleDateFormat date = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println(date);
	}
	public void borrowDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		dayOfMonth = day;
		System.out.println("You've borrowed item at : " + dayOfMonth + "-" + this.month + "-" + 
				this.year);
	}
	public void print() {
		System.out.print("Today's Date: ");
		getTime();
		borrowDate(year, month, dayOfMonth);
	}
}
