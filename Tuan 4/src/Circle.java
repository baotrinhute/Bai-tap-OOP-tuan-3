public class Circle extends AShape{
    private int radius;
    private CartesianPoint location;

    public Circle(CartesianPoint location,int radius){
        this.location = location;
        this.radius = radius;
    }
}