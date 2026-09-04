import junit.framework.TestCase;

public class TestEntry extends TestCase {
    public void testConstructor() {
        Date d1 = new Date(5, 6, 2003);
        Entry e1 = new Entry(d1, 5.3, 27, "Good");
        ALog a1 = new EmptyLog();
        ALog a2 = new ConsLog(e1,a1);

        Date d2 = new Date(6, 6, 2003);
        Entry e2 = new Entry(d2, 2.8, 24, "Tired");
        ALog a3 = new ConsLog(e2,a2);

        Date d3 = new Date(23, 6, 2003);
        Entry e3 = new Entry(d3, 26.2, 150, "Exhausted");
        ALog a4 = new ConsLog(e3,a3);

        Date d4 = new Date(28,6, 2004);
        Entry e4 = new Entry(d4, 26.2, 250, "Good recovery");
        ALog a5 = new ConsLog(e4,a4);
    }
}


