
public class Cart {
    public static final int Max_Numbers_Ordered = 20;
    DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[Max_Numbers_Ordered];
    int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < Max_Numbers_Ordered) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("the disc had been added.");
        } else {
            System.out.println("the Cart is almost full.");
        }
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
}

