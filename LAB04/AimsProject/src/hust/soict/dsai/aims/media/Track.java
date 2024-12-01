package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private int length;
	private String title;
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public String getTitle() {
		return title;
	}
	
	public void play() {
    	System.out.println("Playing Track: "+ this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
	}
@Override
public boolean equals(Object obj) {
	Track obj1 = (Track) obj;
	return title.equals(obj1.title) && length==obj1.length;
}
}