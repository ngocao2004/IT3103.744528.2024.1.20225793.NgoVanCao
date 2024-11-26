package hust.soict.dsai.aims;
import src.hust.soict.dsai.aims.disc.*;
import src.hust.soict.dsai.aims.cart.*;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animations" , "Rogol Allers",87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        System.out.print("Total Cost is : ");
        System.out.println(anOrder.totalCost());
        dvd1.hienThiThongTin();
        dvd2.hienThiThongTin();
        anOrder.printIteams();
        anOrder.searchItem("The Lion King");
        dvd1.isMatch("The Lion King");
    }
}

