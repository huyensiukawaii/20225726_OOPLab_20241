package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}
    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println(track.getTitle() + " has been added.");
        } else {
            System.out.println(track.getTitle() + " already in the tracks list");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println(track.getTitle() + " has been removed");
        } else {
            System.out.println(track.getTitle() + " is not in the tracks list");
        }
    }

    public void play() {
        System.out.println("CD: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Total tracks: " + tracks.size());
        System.out.println("Total length: " + this.getLength() + " seconds");

        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}
