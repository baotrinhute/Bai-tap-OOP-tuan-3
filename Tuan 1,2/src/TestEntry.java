import junit.framework.TestCase;

public class TestEntry extends TestCase {
    public void testConstructor(){
        Date d1 = new Date(5,6,2003);
        Entry e1 = new Entry(d1,5.3,27,"Good");

        Date d2 = new Date(6,6,2003);
        Entry e2 = new Entry(d2,2.8,24,"Tired");

        Date d3 = new Date(23,6,2003);
        Entry e3 = new Entry(d3,26.2,150,"Exhausted");
    }

    public void testPace() {
        Entry entry1 = new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
        assertEquals(5.094, entry1.pace(), 0.001);

        Entry entry2 = new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
        assertEquals(8.571, entry2.pace(), 0.001);

        Entry entry3 = new Entry(new Date(23, 6, 2004), 26.2, 159, "exhausted");
        assertEquals(6.069, entry3.pace(), 0.001);
    }

    public void testEarlierDate(){
        Date date1 = new Date(5, 6, 2004);
        Date date2 = new Date(6, 6, 2004);
        Date date3 = new Date(23,6, 2004);
        assertTrue(date2.EarlierDate(date1));
        assertFalse(date2.EarlierDate(date2));
        assertFalse(date2.EarlierDate(date3));
    }
}

