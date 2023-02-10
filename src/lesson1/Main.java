package lesson1;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев Толстой");
        System.out.println("tolstoy.getAuthor() = " + tolstoy.getAuthor());
        Author pushkin = new Author("Александр Пушкин");
        System.out.println("pushkin.getAuthor() = " + pushkin.getAuthor());
        Book wordAndPeace = new Book("Война и мир", tolstoy, 1865);
        System.out.println("wordAndPeace.getPublicationYear() = " + wordAndPeace.getPublicationYear());
        wordAndPeace.setPublicationYear(1869);
        System.out.println("wordAndPeace.getPublicationYear() = " + wordAndPeace.getPublicationYear());
        Book tales = new Book("Сказки", pushkin, 1822);
        System.out.println("tales.getAuthor() = " + tales.getAuthor());
        System.out.println("tales.getTitle() = " + tales.getTitle());
        System.out.println("tales.getPublicationYear() = " + tales.getPublicationYear());
        System.out.println("tales = " + tales);
    }
}
