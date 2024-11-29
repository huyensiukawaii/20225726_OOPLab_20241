package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		super(0, "Unknown Title", "Unknown Category", 0.0f);
	}
	
	public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println(authorName + "has been add.");	
		} else {
			System.out.println(authorName + "is already in the authors list.");
		}
	}
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println(authorName+ "has been removed.");
		} else {
			System.out.println(authorName + "is not in the authors list.");
		}
	}
}
