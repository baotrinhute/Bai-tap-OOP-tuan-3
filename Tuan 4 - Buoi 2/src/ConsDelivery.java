public class ConsDelivery extends AList{
    private Package first;
    private AList rest;
    public ConsDelivery(Package first, AList rest){
        this.first = first;
        this.rest = rest;
    }
}
