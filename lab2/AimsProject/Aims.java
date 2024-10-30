
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animations" , "Rogol Allers",87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation1",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin","Animation2",18.99f);
        anOrder.addDigitalVideoDisc(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin","Animation3",18.99f);
        anOrder.addDigitalVideoDisc(dvd5);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin","Animation4",18.99f);
        anOrder.addDigitalVideoDisc(dvd6);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Aladin","Animation5",18.99f);
        anOrder.addDigitalVideoDisc(dvd7);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Aladin","Animation6",18.99f);
        anOrder.addDigitalVideoDisc(dvd8);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin","Animation7",18.99f);
        anOrder.addDigitalVideoDisc(dvd9);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Aladin","Animation8",18.99f);
        anOrder.addDigitalVideoDisc(dvd10);
        DigitalVideoDisc dvd11 = new DigitalVideoDisc("Aladin","Animation9",18.99f);
        anOrder.addDigitalVideoDisc(dvd11);
        DigitalVideoDisc dvd12 = new DigitalVideoDisc("Aladin","Animation10",18.99f);
        anOrder.addDigitalVideoDisc(dvd12);
        DigitalVideoDisc dvd13 = new DigitalVideoDisc("Aladin","Animation11",18.99f);
        anOrder.addDigitalVideoDisc(dvd13);
        DigitalVideoDisc dvd14 = new DigitalVideoDisc("Aladin","Animation12",18.99f);
        anOrder.addDigitalVideoDisc(dvd14);
        DigitalVideoDisc dvd15 = new DigitalVideoDisc("Aladin","Animation13",18.99f);
        anOrder.addDigitalVideoDisc(dvd15);
        DigitalVideoDisc dvd16 = new DigitalVideoDisc("Aladin","Animation14",18.99f);
        anOrder.addDigitalVideoDisc(dvd16);
        DigitalVideoDisc dvd17 = new DigitalVideoDisc("Aladin","Animation15",18.99f);
        anOrder.addDigitalVideoDisc(dvd17);
        DigitalVideoDisc dvd18 = new DigitalVideoDisc("Aladin","Animation16",18.99f);
        anOrder.addDigitalVideoDisc(dvd18);
        DigitalVideoDisc dvd19 = new DigitalVideoDisc("Aladin","Animation17",18.99f);
        anOrder.addDigitalVideoDisc(dvd19);
        DigitalVideoDisc dvd20 = new DigitalVideoDisc("Aladin","Animation18",18.99f);
        anOrder.addDigitalVideoDisc(dvd20);
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("Aladin","Animation19",18.99f);
        anOrder.addDigitalVideoDisc(dvd21);
        DigitalVideoDisc dvd22 = new DigitalVideoDisc("Aladin","Animation20",18.99f);
        anOrder.addDigitalVideoDisc(dvd22);
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.print("Total Cost is : ");
        System.out.println(anOrder.totalCost());
    }
}

