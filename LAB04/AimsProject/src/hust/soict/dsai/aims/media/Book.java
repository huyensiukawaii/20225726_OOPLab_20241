package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost) {
	    super(id, title, category, cost);
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
			System.out.println(authorName + " has been add.");	
		} else {
			System.out.println(authorName + " is already in the authors list.");
		}
	}
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println(authorName+ " has been removed.");
		} else {
			System.out.println(authorName + " is not in the authors list.");
		}
	}
	public String toString() {
        return "Book - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getAuthors() + " min: " + this.getCost() + " $";
    }
}
