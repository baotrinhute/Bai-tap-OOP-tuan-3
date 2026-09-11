import junit.framework.TestCase;

public class APlaceTest extends TestCase {
    public void testConstructor(){
        APlace museum = new Museum(35.5,"Louvere",new Locations("Seine","Ave"));
        Hour open = new Hour(6,30);
        Hour close = new Hour(22,30);
        APlace shop = new Shop("Phone",open,close,"Samsung",new Locations("Tokyo","Kyoto"));
        APlace restaurant = new Restaurant("Fried Chicken",2.35,"KFC", new Locations("New York","Texas"));
    }
}
