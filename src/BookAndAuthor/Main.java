package BookAndAuthor;

/**
 * Created by RENT on 2017-08-21.
 */
public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("Tolkien", "email", 'm');
        System.out.println(tolkien);

        Book book = new Book("Hobbit", new Author("Tolkien", "email", 'm'), 23.99, 6);
        System.out.println(book);
    }
}
