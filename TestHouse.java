import junit.framework.TestCase;

public class TestHouse extends TestCase {
    public void testConstructor(){
        Address r1 = new Address(23, "Maple Street","Brookline");
        House h1 = new House("Ranch",7,375.000,r1);
        AList a1 = new Empty();
        AList a2 = new ConsHouse(h1,a1);

        Address r2 = new Address(5,"Joye Road","Newton");
        House h2 = new House("Colonial",9,450.000,r2);
        AList a3 = new ConsHouse(h2,a2);

        Address r3 = new Address(83,"Winslow Road","waltham");
        House h3 = new House("Cape",6,235.000,r3);
        AList a4 = new ConsHouse(h3,a3);
    }
}
