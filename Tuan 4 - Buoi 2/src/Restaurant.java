public class Restaurant extends APlace {
    private String foodKind;
    private double price;
    public Restaurant(String foodKind, double price, String name, Locations location){
        this.foodKind = foodKind;
        this.price = price;
        super(name,location);
    }
}
