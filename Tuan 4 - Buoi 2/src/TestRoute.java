import junit.framework.TestCase;

public class TestRoute extends TestCase{
    public void testConstructor(){
        ClockTime t1 = new ClockTime(10,20);
        ClockTime t2 = new ClockTime(11,34);
        ClockTime t3 = new ClockTime(13,18);
        Station Penn = new Station("Penn",t1);
        Station GrabCentral = new Station("GrabCentral",t2);
        Station South = new Station("South",t3);
        Schedule s1 = new Schedule(Penn,GrabCentral,South,true);
        Route r1 = new Route("New York","Boston",s1);
        AList a1 = new Empty();
        AList a2 = new ConsRoute(r1,a1);
    }
}