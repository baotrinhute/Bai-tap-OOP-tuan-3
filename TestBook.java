import junit.framework.TestCase;

public class TestBook extends TestCase{
    public void testConstructor(){
        Book b1 = new Book("Daniel Defoe","Robinson Crusoe",15.50,1719);
        AList a1 = new Empty();
        AList a2 = new ConsBook(b1,a1);

        Book b2 = new Book("Joseph","Heart of Darkness",12.80,1902);
        AList a3 = new ConsBook(b2,a2);

        Book b3 = new Book("Pat Conroy","Beach Music",9.5,1996);
        AList a4 = new ConsBook(b3,a3);
    }
}
