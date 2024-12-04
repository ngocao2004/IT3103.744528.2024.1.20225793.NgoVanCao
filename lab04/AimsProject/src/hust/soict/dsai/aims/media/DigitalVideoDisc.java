package src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDisc=0;
    private int length;
    private String director;


    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
		this.length = length;
	}
    
    public DigitalVideoDisc(String title) {
    	this.setTitle(title);
    }
    
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.length = length;
        this.director = director;
    }


    public DigitalVideoDisc(String title, String category,float cost) {
        super(title,category,cost);
    }

    public DigitalVideoDisc(String title, String category, String director,float cost) {
        super(title,category,cost);
        this.director = director;
    }
    
    
    @Override
    public String toString() {
        return "DVD [Title: " + getTitle() +
               ", Category: " + getCategory() +
               ", Cost: " + getCost() + "]";
    }

    
    public boolean isMatch(String Title) {
    	if(this.getTitle().equals(Title)) {
    		return true;
    	}
    	else return false;
    }


    public void hienThiThongTin(){
        System.out.println("title : " +this.title + "\ncategory : "+ this.category + "\ndirector : " + this.director + "\nlength : "+ this.length + "\ncost : " + this.cost +"\nid : "+this.id);
    }
    
    
    public void play() {

    	System.out.println("Đang phát DVD: " + this.getTitle());

    	System.out.println("Độ dài DVD: " + this.getLength());

    	}
}
