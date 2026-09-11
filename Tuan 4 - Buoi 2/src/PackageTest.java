import junit.framework.TestCase;

public class PackageTest extends TestCase {
    public void testConstructor(){
        boxSize b1 = new boxSize(15,25);
        Address a1 = new Address(14,"Truong Dinh","District 1","Bien Hoa","Vietnam");
        Address a2 = new Address(67,"Nguyen Ai Quoc","District 1","Ho Chi Minh","Vietnam");
        PersonInfo rep1 = new PersonInfo("Peter",a1);
        PersonInfo sen1 = new PersonInfo("Ethan",a2);
        Package p1 = new Package(b1,65.7,rep1,sen1,"https//youtube.com");
        AList A1 = new Empty();
        AList A2 = new ConsDelivery(p1,A1);
    }
}
