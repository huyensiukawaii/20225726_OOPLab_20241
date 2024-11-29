package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS_IN_STORE = 20;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    // Add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("Added to store: " + dvd.getTitle());
        } else {
            System.out.println("Store is full. Cannot add: " + dvd.getTitle());
        }
    }

    // Remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        if (qtyInStore == 0) {
            System.out.println("The store is empty. Cannot remove any DVDs.");
            return;
        }

        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].getId() == dvd.getId()) {
                // Shift remaining items to fill the gap
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("Removed from store: " + dvd.getTitle());
                return;
            }
        }

        System.out.println("The DVD " + dvd.getTitle() + " was not found in the store.");
    }

    // Display DVDs in the store
    public void displayStore() {
        System.out.println("***********************STORE*************************");
        if (qtyInStore == 0) {
            System.out.println("The store is empty!");
        } else {
            for (int i = 0; i < qtyInStore; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
        System.out.println("***************************************************");
    }
}
