package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class BookAndAuthorTests {

    @Test
    public void authorDefaultGetNameGetEmailGetGender(){
        Author tolkien = new Author("Tolkien", "email", 'm');
        Assert.assertEquals("Tolkien", tolkien.getName());
        Assert.assertEquals("email", tolkien.getEmail());
        Assert.assertEquals(new Character('m'), tolkien.getGender());
    }
    @Test
    public void authorDefaultSetEmail(){
        Author tolkien = new Author("Tolkien", "email", 'm');
        tolkien.setEmail("newmail");
        Assert.assertEquals("newmail", tolkien.getEmail());
    }
    @Test
    public void authorDefaultToString(){
        Author tolkien = new Author("Tolkien", "email", 'm');
        Assert.assertEquals("Author[name=Tolkien, email=email, gender=m]", tolkien.toString());
    }
    @Test
    public void BookDefaultGetNameGetAuthorGetPrice(){
        Book book = new Book("Hobbit", new Author("Tolkien", "email", 'm'), 23.99, 6);
        Assert.assertEquals("Hobbit", book.getName());
        Assert.assertEquals(23.99, book.getPrice(), 0.01);
    }


}
