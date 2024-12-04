package src.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{



private List<String> authors = new ArrayList<String>();

public Book() {
  super();
}

public Book(String title, String Category, float cost) {
    super(title, Category, cost);
}

public void addAuthor(String authorName) {
  if (this.authors.contains(authorName)) return;
  this.authors.add(authorName);
}

public void removeAuthor(String authorName) {
  if (!this.authors.contains(authorName)) return;
  this.authors.remove(authorName);
}

public List<String> getAuthors() {
	return authors;
}

@Override
public String toString() {
    return "Book [Title: " + getTitle() +
           ", Category: " + getCategory() +
           ", Cost: " + getCost() +
           ", Authors: " + (authors.isEmpty() ? "None" : authors) + "]";
}

}
