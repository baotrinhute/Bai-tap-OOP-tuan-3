public class Square extends AShape{
    private int side;
    private CartesianPoint location;

    public Square(CartesianPoint location,int side){
        this.location = location;
        this.side = side;
    }
}