package src.hust.soict.dsai.aims.cart;
import src.hust.soict.dsai.test.cart.*;
import src.hust.soict.dsai.aims.media.*;
import src.hust.soict.dsai.aims.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public static final int Max_Numbers_Ordered = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    
    
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
        	itemsOrdered.add(media);
            System.out.println("Media added to the cart: " + media.getTitle());
        } else {
            System.out.println("Media already exists in the cart: " + media.getTitle());
        }
    }


    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
        	itemsOrdered.remove(media);
            System.out.println("Media removed from the cart: " + media.getTitle());
        } else {
            System.out.println("Media not found in the cart: " + media.getTitle());
        }
    }

    public float totalCost() {
        float cost = 0;
        for (Media i : itemsOrdered) {
            cost += i.getCost();
        }
        return cost;
    }
    
    public void print() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (Media i : itemsOrdered) {
                System.out.println(i);
            }
        }
    }
    
    
    public void filterById(int id) {
        boolean found = false;
        System.out.println("Filtered by ID: " + id);
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with the given ID.");
        }
    }
    
    public void filterByTitle(String title) {
        boolean found = false;
        System.out.println("Filtered by Title: " + title);
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with the given title.");
        }
    }
    
    
    
    public void clear() {
        itemsOrdered.clear();
        System.out.println("The cart has been cleared.");
    }
    
    
    
    public void sortByTitle() {
        java.util.Collections.sort(itemsOrdered, Media.comparator_By_Title_Cost);
    }

    public void sortByCost() {
        java.util.Collections.sort(itemsOrdered, Media.comparator_By_Cost_Title);
    }

}

