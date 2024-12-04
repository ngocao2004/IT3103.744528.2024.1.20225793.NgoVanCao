package src.hust.soict.dsai.aims.store;
import src.hust.soict.dsai.aims.media.*;
import java.util.ArrayList;

public class Store {
	public static final int Max_Numbers = 20;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	
	
	public void addMedia(Media media) {
		if(itemsInStore.contains(media)) return;
		itemsInStore.add(media);
	} 
	
	
	public void removeMedia(Media media) {
		if(!itemsInStore.contains(media)) return;
		itemsInStore.remove(media);
	}
	
	public  ArrayList<Media> getItems(){
		return itemsInStore;
	}
	
	
	public Media findMediaByTitle(String title) {
        for (Media media : getItems()) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
	

}
