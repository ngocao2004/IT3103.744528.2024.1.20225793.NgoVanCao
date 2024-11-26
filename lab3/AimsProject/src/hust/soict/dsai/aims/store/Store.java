package src.hust.soict.dsai.aims.store;
import src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int Max_Numbers = 20;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[Max_Numbers];
    int dem = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        int i;
        for(i = 0; this.itemsInStore[i] != null && i < Max_Numbers; ++i) {
        }

        if (i == Max_Numbers) {
            System.out.println("Max capacity exceeded");
        } else {
            this.itemsInStore[i] = dvd;
            System.out.println(dvd.toString() + " added to the store");
        }
        dem++;

    }
    
    public void remove(DigitalVideoDisc dvd) {
    	int k=0;
        for(int i = 0;i<dem ; ++i) {
            if (itemsInStore[i].equals(dvd)) {
            	k=1;
            	for(int j =i;j<dem;j++) {
            		itemsInStore[j]=itemsInStore[j+1];
            	}
            	dem--;
            	itemsInStore[dem]=null;
                System.out.println(dvd.toString() + " has been removed from the store.");
            }
        }

        if(k==0) System.out.println("DVD not found in store.");
    }

}
