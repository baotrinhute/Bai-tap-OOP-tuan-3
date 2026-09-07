public class House {
    private String kind;
    private int room;
    private double cost;
    private Address address;

    public House(String kind,int room, double cost, Address address) {
        this.kind = kind;
        this.room = room;
        this.cost = cost;
        this.address = address;
    }
}