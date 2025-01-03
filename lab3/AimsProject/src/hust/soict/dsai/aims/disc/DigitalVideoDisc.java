package src.hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc=0;


    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public int getId() {
    	return id;
    }
    
    
    

    public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category,float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost=cost;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director,float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        ++nbDigitalVideoDisc;
        this.id = nbDigitalVideoDisc;
    }
    
    public String toString() {
    	String thongtin = this.getTitle()+" - "+this.getCategory() +" - "+ this.getDirector() + " - " +this.getCost();
    	return thongtin;
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
}
