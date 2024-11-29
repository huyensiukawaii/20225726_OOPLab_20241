package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc{
	private String artist;
	private List<String> track = new ArrayList<String>();
	int sumLength = 0;
	
	public CompactDisc(String title, String category, String artist, float cost, int length, String director, int nbDigitalVideoDiscs) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director);  // Gọi constructor của lớp cha
        this.artist = artist;
    }
	
	public String getArtist() {
		return artist;
	}
	public void addTrack(String trackTitle) {
		if(!track.contains(trackTitle)) {
			track.add(trackTitle);
			System.out.println(trackTitle +" has been added.");
		} else {
			System.out.println(trackTitle + " already in the tracks list");
		}
	}
	public void removeTrack(String trackTitle) {
		if(!track.contains(trackTitle)) {
			track.remove(trackTitle);
			System.out.println(trackTitle + " has been removed");
		} else {
			System.out.println(trackTitle+" is not in the tracks list" );
		}
	}
	

}
