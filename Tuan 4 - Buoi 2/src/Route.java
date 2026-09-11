public class Route {
    private String origin;
    private String destination;
    private Schedule schedule;

    public Route(String origin, String destination, Schedule schedule){
        this.origin = origin;
        this.destination = destination;
        this.schedule = schedule;
    }
}
