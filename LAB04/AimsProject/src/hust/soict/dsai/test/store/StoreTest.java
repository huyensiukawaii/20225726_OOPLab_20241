package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display store items
        store.displayStore();

        // Remove a DVD
        store.removeDVD(dvd2);

        // Display store items after removal
        store.displayStore();

        // Attempt to remove a DVD that does not exist
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen");
        store.removeDVD(dvd4);

        // Display store items after trying to remove non-existing DVD
        store.displayStore();
    }
}
