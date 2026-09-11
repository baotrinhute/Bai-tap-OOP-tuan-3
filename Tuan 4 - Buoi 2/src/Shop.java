public class Shop extends APlace{
    private String item;
    private Hour openinghour;
    private Hour closinghour;
    public Shop(String item, Hour openinghour, Hour closinghour, String name, Locations location){
        this.item = item;
        this.openinghour = openinghour;
        this.closinghour = closinghour;
        super(name,location);
    }
}
