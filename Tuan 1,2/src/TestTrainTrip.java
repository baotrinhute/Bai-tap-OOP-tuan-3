import junit.framework.TestCase;

public class TestTrainTrip extends TestCase{
    public void testConstructor(){
        Route r1 = new Route("New York","Boston");
        Route r2 = new Route("Chicago","New York");
        ClockTime t1a = new ClockTime(23,50);
        ClockTime t1b = new ClockTime(13,20);
        ClockTime t2a = new ClockTime(10,34);
        ClockTime t2b = new ClockTime(13,18);
        Schedule s1 = new Schedule(t1a,t1b);
        Schedule s2 = new Schedule(t2a,t2b);
        new TrainTrip(r1,s1,true);
        new TrainTrip(r2,s2,false);
    }
}