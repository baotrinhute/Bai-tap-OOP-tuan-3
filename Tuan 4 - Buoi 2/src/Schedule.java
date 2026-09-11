public class Schedule {
    private Station departure;
    private Station stop;
    private Station arrival;
    private boolean local;

    public Schedule(Station departure,Station stop, Station arrival, boolean local){
        this.departure = departure;
        this.stop = stop;
        this.arrival = arrival;
        this.local = local;
    }
}
