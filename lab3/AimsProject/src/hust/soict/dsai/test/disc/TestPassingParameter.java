package src.hust.soict.dsai.test.disc;
import src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main (String args[]) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle DVD title : "+jungleDVD.getTitle());
		System.out.println("cinderella DVD title : "+cinderellaDVD.getTitle());
		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.println("jungle dvd title : "+jungleDVD.getTitle());
	}
	public static void swap(Object dvd1,Object dvd2) {
		Object dvd = dvd1;
		dvd1=dvd2;
		dvd2 = dvd;
	}
	public static void changeTitle(DigitalVideoDisc dvd1, String title) {
		String oldTitle = dvd1.getTitle();
		dvd1.setTitle(title);
		dvd1 = new DigitalVideoDisc(oldTitle);
	}

}
