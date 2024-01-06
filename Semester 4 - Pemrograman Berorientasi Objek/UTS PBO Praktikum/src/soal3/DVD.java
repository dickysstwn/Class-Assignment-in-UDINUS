package soal3;

public class DVD extends AudioVideo {
	String director;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public void print() {
		System.out.println ("Director : " + getDirector());
	}
}
