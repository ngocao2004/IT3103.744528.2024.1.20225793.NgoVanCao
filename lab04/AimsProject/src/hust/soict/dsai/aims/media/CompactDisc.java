package src.hust.soict.dsai.aims.media;
import java.util.List;
import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable {
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	
	public String getArtist() {
		return artist;
	}
	
	
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public CompactDisc(String title, String category, float cost, String director, int length, String artist) {
		super(title, category, cost, director, length);
	    this.artist = artist;
		
	}
	
	
	
	
	public CompactDisc(String title, String category, float cost, String director, String artist) {
		super(title, category, cost, director);
		this.artist = artist;
	}
	
	
	
	
	public CompactDisc(String title, String category, float cost, String artist) {
		super(title, category, cost);
		this.artist = artist;
	}
	
	
	
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Track already in CompactDisc");
			return;
		}
		tracks.add(track);
		System.out.println("Track added to CompactDisc");
	}
	
	
	
	public void removeTrack(Track track) {
		if(!tracks.contains(track)) {
			System.out.println("Track not found in CompactDisc");
			return;
		}
		tracks.remove(track);
		System.out.println("Track removed from CompactDisc");
	}
	
	
	
	public int getLength() {
		int len = 0;
		for(Track i : tracks) {
			len += i.getLength();
		}
		return len;
	}
	
	
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD by: " + this.getArtist());
		for(Track i : tracks) {
			i.play();
		}
	}

}
