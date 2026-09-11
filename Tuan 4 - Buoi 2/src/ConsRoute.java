public class ConsRoute extends AList {
    private Route first;
    private AList rest;
    public ConsRoute(Route first, AList rest){
        this.first = first;
        this.rest = rest;
    }
}
