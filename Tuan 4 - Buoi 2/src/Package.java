public class Package {
    private boxSize boxsize;
    private double weight;
    private PersonInfo recipient;
    private PersonInfo sender;
    private String URL;
    public Package(boxSize boxsize, double weight, PersonInfo recipient, PersonInfo sender, String URL){
        this.boxsize = boxsize;
        this.weight = weight;
        this.recipient = recipient;
        this.sender = sender;
        this.URL = URL;
    }
}
