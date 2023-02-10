package lesson2;


import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return this.title + " " + author.toString() + " " + this.publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c = (Book) other;
        return author.equals(c.getAuthor()) && title.equals(c.title) && publicationYear == c.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
