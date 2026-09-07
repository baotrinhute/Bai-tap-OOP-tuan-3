public class Address {
    int housenum;
    String street;
    String city;

    public Address(int housenum, String street, String city ){
        this.housenum = housenum;
        this.street = street;
        this.city = city;
    }

    public boolean InThisCity(String city2){
        return this.city.equals(city2);
    }

    public boolean SameCity(Address that){
        return this.city.equals(that.city);
    }
}
