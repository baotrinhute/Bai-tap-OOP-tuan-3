public class Museum extends APlace {
    Double admissionPrice;
    public Museum(Double admissionPrice, String name, Locations location){
        super(name,location);
        this.admissionPrice = admissionPrice;
    }
}
