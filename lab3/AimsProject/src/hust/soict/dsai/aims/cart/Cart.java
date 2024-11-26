package src.hust.soict.dsai.aims.cart;
import src.hust.soict.dsai.aims.disc.*;
import src.hust.soict.dsai.test.cart.*;
import src.hust.soict.dsai.aims.*;

public class Cart {
    public static final int Max_Numbers_Ordered = 20;
    DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[Max_Numbers_Ordered];
    int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < Max_Numbers_Ordered) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("the disc "+disc.getTitle()+" had been added.");
        } else {
            System.out.println("the Cart is almost full.");
        }
    }
    
   public void addDigitalVideoDisc(DigitalVideoDisc dvdList[]) {
	   for(int i= 0;i<dvdList.length;i++) {
		   if(qtyOrdered<Max_Numbers_Ordered) {
			   itemsOrdered[qtyOrdered] = dvdList[i];
			   qtyOrdered++;
			   System.out.println("the disc "+dvdList[i].getTitle()+"had been added.");
		   }
		   else {
			   System.out.println("the Cart is almost full.");
		   }
	   }
   }
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc1 , DigitalVideoDisc disc2) {
    	addDigitalVideoDisc(disc1);
    	addDigitalVideoDisc(disc2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc Disc) {
        int found = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(Disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                itemsOrdered[qtyOrdered] = null;
                System.out.println("the Disc has been removed");
                found = 1;
            }
        }
        if (found == 0) {
            System.out.println("the disc was not found in the Cart.");
        }

    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public void printIteams() {
    	System.out.println("**********CART**********");
    	for(int i = 0;i<qtyOrdered;i++) {
    		System.out.println(i+1+". "+itemsOrdered[i].getTitle() + " - "+itemsOrdered[i].getCategory() + " - "+itemsOrdered[i].getDirector() + " - "+itemsOrdered[i].getLength() + " - "+itemsOrdered[i].getCost());
    	}
    	System.out.println("tong gia tien :"+totalCost());
    	
    }
    
    public void searchItem(int ID) {
    	for(int i = 0;i<qtyOrdered;i++) {
    		if(itemsOrdered[i].getId() == ID) {
    			System.out.println("Found item with id = "+ID);
    			System.out.println(itemsOrdered[i].toString());
    			return;
    		}
    		else {
    			System.out.println("Item Not Found.");
    		}
    	}
    }
    
    public void searchItem(String Title) {
    	int c =0;
    	for(int i = 0;i<qtyOrdered;i++) {
    		if(itemsOrdered[i].getTitle().equals(Title)) {
    			System.out.println("Found item with title = "+Title);
    			System.out.println(itemsOrdered[i].toString());
    			c++;
    		}
    	}
    	if(c==0) {
    		System.out.println("Item Not Found;");
    	}
    }
}

