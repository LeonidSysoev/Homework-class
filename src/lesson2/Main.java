package lesson2;



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
        Book tales2 = new Book("Сказки", pushkin, 1822);
        System.out.println("tales.getAuthor() = " + tales.getAuthor());
        System.out.println("tales.getTitle() = " + tales.getTitle());
        System.out.println("tales.getPublicationYear() = " + tales.getPublicationYear());
        System.out.println("tales = " + tales);
        System.out.println("tolstoy.equals(pushkin) = " + tolstoy.equals(pushkin));
        System.out.println("tales2.equals(tales) = " + tales2.equals(tales));
        System.out.println("tales2.hashCode() = " + tales2.hashCode());
        System.out.println("tales.hashCode() = " + tales.hashCode());
        System.out.println("tolstoy.hashCode() = " + tolstoy.hashCode());
        System.out.println("pushkin.hashCode() = " + pushkin.hashCode());
    }
}
