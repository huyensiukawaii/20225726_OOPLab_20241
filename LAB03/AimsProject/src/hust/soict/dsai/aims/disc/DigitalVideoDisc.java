package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc{ 
	public static int nbDigitalVideoDiscs = 0;
	private int id;
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id=nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
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
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " min: " + cost + " $";
    }
    
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
    
    public static int getNextId() {
        return nbDigitalVideoDiscs++;
    }
    public int getId() {
		return id;
	}
}
