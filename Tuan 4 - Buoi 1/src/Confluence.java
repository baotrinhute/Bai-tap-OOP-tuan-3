public class Confluence extends ARiverExtend {
    private ARiverExtend left;
    private ARiverExtend right;
    public Confluence(Location location, ARiverExtend left, ARiverExtend right){
        super(location);
        this.left = left;
        this.right = right;
    }
}
