package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;
public class DVD extends Disc implements Playable {
	// Define attributes
	private static int nbDigitalVideoDisc= 0; // Class Atrribute
    // Define methods
	
    // Constructor by title 
	public DVD(String title) {
        super(title);
        
    }
    // Constructor by title, category and cost
    public DVD(String title, String category, float cost) {
        super(title, category, cost);
    }
//    // Constructor by title, category, director and cost
//    public DigitalVideoDisc(String title, String category, String director, float cost) {
//        this.title = title;
//        this.category = category;
//        this.director = director;
//        this.cost = cost;
//        this.id = ++nbDigitalVideoDisc; // Update class variable and assign id
//    }
    // Constructor by all attributes
    public DVD(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
	}
    
    // Getter methods
    public static int getNbDigitalVideoDisc() {
		return nbDigitalVideoDisc;
	}
    
    
	public String toString() {
		return "Media ID: " + getId() + " - DVD - [" + getTitle() + "] - [" + getCategory() + "] - [" + getDirector() + "] - [" + getLength() + "]: [" + getCost() + "] $";
	}
    @Override
	public String play() {
		return "Playing DVD: " + this.getTitle() + "\nDVD length: " + this.getLength();
	
	}
    
    public String playGUI() throws PlayerException{
    	if (this.getLength() > 0) {
    		return "PLaying DVD: " + this.getTitle() + "\n" + "DVD length: " + this.getLength();
    	}
    	else {
    		throw new PlayerException("ERROR: DVD length is non-positive!");
    	}
    }
}


