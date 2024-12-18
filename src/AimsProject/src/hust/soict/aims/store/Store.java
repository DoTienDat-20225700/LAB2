package hust.soict.aims.store;
import hust.soict.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_IN_STORE = 50;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int qtyInStore = 0;

    // Add a DVD to the store
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_NUMBERS_IN_STORE) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The DVD " + disc.getTitle() + " has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Remove a DVD from the store
    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("The DVD " + disc.getTitle() + " has been removed from the store.");
                return;
            }
        }
        System.out.println("The DVD " + disc.getTitle() + " is not found in the store.");
    }
}
