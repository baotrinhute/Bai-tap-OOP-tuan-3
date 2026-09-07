public class Square extends AShape{
    private int size;

    public Square(CartesianPoint location,int side){
        super(location);
        this.size = side;
    }
}