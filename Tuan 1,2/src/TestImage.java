import junit.framework.TestCase;

public class TestImage extends TestCase {
    public void testConstructor() {
        new Image(5, 10, "small.gif", "low");
        new Image(120, 200, "med.gif", "low");
        new Image(1200, 1000, "large.gif", "high");
    }

    public void testisPortrait(){
        assertFalse(new Image(5, 10, "small.gif", "low").isPortrait());
        assertFalse(new Image(120, 200, "med.gif", "low").isPortrait());
        assertTrue(new Image(1200, 1000, "large.gif", "high").isPortrait());
    }

    public void testSize() {
        assertEquals(50, new Image(5, 10, "small.gif", "low").size());
        assertEquals(24000, new Image(120, 200, "med.gif", "low").size());
        assertEquals(1200000, new Image(1200, 1000, "large.gif", "high").size());
    }

    public void testisLarger(){
        Image a = new Image(5, 10, "small.gif", "low");
        Image b = new Image(120, 200, "med.gif", "low");
        Image c = new Image(1200, 1000, "large.gif", "high");
        assertTrue(b.isLarger(a));
        assertFalse(b.isLarger(b));
        assertFalse(b.isLarger(c));
    }

    public void testSizeString(){
        Image a = new Image(5, 10, "small.gif", "low");
        Image b = new Image(120, 200, "med.gif", "low");
        Image c = new Image(1200, 1000, "large.gif", "high");
        assertEquals("small", a.SizeString());
        assertEquals("medium",b.SizeString());
        assertEquals("large",c.SizeString());
    }
}