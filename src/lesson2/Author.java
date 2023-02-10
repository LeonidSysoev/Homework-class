package lesson2;

import java.util.Objects;

public class Author {
   private final String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return this.author;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c = (Author) other;
        return author.equals(c.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }

}
