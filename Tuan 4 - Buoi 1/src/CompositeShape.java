public class CompositeShape extends AShape{
    private AShape top;
    private AShape bottom;
    public CompositeShape(AShape top,AShape bottom){
        this.top = top;
        this.bottom = bottom;
    }
}
