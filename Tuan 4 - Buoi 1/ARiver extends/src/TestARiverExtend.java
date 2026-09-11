import junit.framework.TestCase;

public class TestARiverExtend extends TestCase {
    public void testConstructor(){
        MouthExtend pinkRiver =
                new MouthExtend(new Location(7,5,"m"),
                        new Confluence(new Location(5,5,"a"),
                                new Confluence(new Location(3,3,"b"),
                                        new Source(new Location(1,1,"s")),
                                        new Source(new Location(1,5,"t"))),
                                new Source(new Location(3,7,"u"))));
    }
}
