package src.hust.soict.dsai.aims.media;
import java.util.Comparator;



public class Media {
	public static final Comparator<Media> comparator_By_Title_Cost = new MediaComparatorByTitleCost();
	public static final Comparator<Media> comparator_By_Cost_Title = new MediaComparatorByCostTitle();
	private int id;
	private String title;
	private String category;
	private float cost;
	public static int nbMedia = 0;
	
	public Media() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public Media(String title) {
        super();
        this.title = title;
        nbMedia++;
        this.id = nbMedia;
    }
	
	
	public Media(String title, String category,float cost) {
        this.title = title;
        this.category = category;
        this.cost=cost;
        nbMedia++;
        this.id = nbMedia;
    }
	
    @Override
	public String toString() {
		return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
	}
	
	
    @Override
	public boolean equals(Object o) {
		Media m = (Media) o;
		return this.title == m.title;
	}



}
