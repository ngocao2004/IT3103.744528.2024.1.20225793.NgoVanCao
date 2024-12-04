package src.hust.soict.dsai.test.store;
import src.hust.soict.dsai.aims.media.*;
import src.hust.soict.dsai.aims.disc.*;
import src.hust.soict.dsai.aims.store.*;
import java.util.ArrayList;
import java.util.List;
public class TestStore {
	public static void main(String[] args) {
        // Tạo một cửa hàng
        Store store = new Store();

        // Tạo một số DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Disney", 90, 18.99f);

        List<Media> mediae = new ArrayList<Media>();

        Book book = new Book("a","b",1);
        CompactDisc cd = new CompactDisc("e","g",2,"f");
     mediae.add(cd);
     mediae.add(dvd1);
     mediae.add(book);

     for(Media m: mediae) {
     System.out.println(m.toString());

     }


}
}
