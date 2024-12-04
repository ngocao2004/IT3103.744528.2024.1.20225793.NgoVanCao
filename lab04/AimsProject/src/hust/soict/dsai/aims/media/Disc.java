package src.hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	
	public Disc() {
		
	}
	
	
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public Disc(String title, String category, float cost, String director, int length) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	
	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	
	}
	

}
