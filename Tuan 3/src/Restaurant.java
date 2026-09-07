public class Restaurant {
    private String name;
    private String foodKind;
    private String priceRange;
    private Intersection intersection;

    public Restaurant(String name, String foodKind, String priceRange, Intersection intersection) {
        this.name = name;
        this.foodKind = foodKind;
        this.priceRange = priceRange;
        this.intersection = intersection;
    }
}

