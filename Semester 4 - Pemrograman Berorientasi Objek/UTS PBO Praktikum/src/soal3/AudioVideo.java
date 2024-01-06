package soal3;

import java.util.GregorianCalendar;

public class AudioVideo {
	int MAX_BORROW_DAY = 7;

	public int getMAX_BORRO_DAY() {
		return MAX_BORROW_DAY;
	}

	public void setMAX_BORRO_DAY(int mAX_BORRO_DAY) {
		MAX_BORROW_DAY = mAX_BORRO_DAY;
	}
	
	public void dueDate(GregorianCalendar BorrowDate) {
		System.out.println(BorrowDate);
	}
	
}
