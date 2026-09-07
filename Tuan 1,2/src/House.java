public class House {
    private String name;
    private int room;
    private int cost;
    private Address address;

    public House(String name,int room, int cost, Address address) {
        this.name = name;
        this.room = room;
        this.cost = cost;
        this.address = address;
    }

    public boolean HasMoreRooms(House that) {
        return this.room > that.room;
    }

}