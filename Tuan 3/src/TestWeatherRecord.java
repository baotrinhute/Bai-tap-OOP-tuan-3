
import junit.framework.TestCase;

public class TestWeatherRecord extends TestCase {
    public void testConstructor(){
        Date d1 = new Date(12,9,2007);
        TemperatureRange t1 = new TemperatureRange(35,27);
        TemperatureRange t2 = new TemperatureRange(30,25);
        TemperatureRange t3 = new TemperatureRange(40,19);
        WeatherRecord w1 = new WeatherRecord(d1,t1,t2,t3,200.15);
        AList a1 = new Empty();
        AList a2 = new ConsWeatherRecord(w1,a1);
    }
}
