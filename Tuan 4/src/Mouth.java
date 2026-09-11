public class Mouth extends ARiver {
    private ARiver stream;
    public Mouth(Location location,ARiver stream){
        super(location);
        this.stream = stream;
    }
}
