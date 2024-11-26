package src.hust.soict.dsai.test.store;
import src.hust.soict.dsai.aims.disc.*;
import src.hust.soict.dsai.aims.store.*;
public class TestStore {
	public static void main(String[] args) {
        // Tạo một cửa hàng
        Store store = new Store();

        // Tạo một số DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Disney", 90, 18.99f);

        // Thêm DVD vào cửa hàng
        System.out.println("Adding DVDs to the store:");
        store.addDigitalVideoDisc(dvd1);
        store.addDigitalVideoDisc(dvd2);
        store.addDigitalVideoDisc(dvd3);

        // Xóa một DVD khỏi cửa hàng
        System.out.println("\nRemoving a DVD from the store:");
        store.remove(dvd2);


}
}
