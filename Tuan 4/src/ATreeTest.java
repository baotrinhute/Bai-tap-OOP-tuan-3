import junit.framework.TestCase;

public class ATreeTest extends TestCase {
    public void testConstructor() {
        ATree bob = new DataNode(new Person("Bob", 1917), new EmptyNode(), new EmptyNode());
        ATree angela = new DataNode(new Person("Angela", 1936), new EmptyNode(), new EmptyNode());
        ATree robert = new DataNode(new Person("Robert", 1935), new EmptyNode(), new EmptyNode());

        ATree annie = new DataNode(new Person("Annie", 1938), bob, new EmptyNode());
        ATree janet = new DataNode(new Person("Janet", 1958), robert, angela);
        ATree paul = new DataNode(new Person("Paul", 1956), new EmptyNode(), annie);

        ATree familyTree = new DataNode(new Person("Peter", 1980), paul, janet);
    }
}
