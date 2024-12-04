package src.hust.soict.dsai.test.cart;
import src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import src.hust.soict.dsai.aims.cart.Cart;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
		"Animation", "Roger Allers", 87, 19.95f);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		DigitalVideoDisc dvdList[] = {dvd1,dvd2};
		cart.addDigitalVideoDisc(dvdList);
		}
}
