package src.hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	
	
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	
	public track() {
		
	}
	
	public void play() {

		System.out.println("Playing track: " + this.getTitle());

		System.out.println("Track length: " + this.getLength());

		}
	
	@Override
	public boolean equals(Object o) {
		Track m = (Track) o;
		return this.title == m.title;
	}

}
