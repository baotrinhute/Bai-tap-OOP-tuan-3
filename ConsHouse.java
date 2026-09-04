public class ConsHouse extends AList {
    private House first;
    private AList rest;
    public ConsHouse(House first, AList rest){
        this.first = first;
        this.rest = rest;
    }
}
