public class ConsBook extends AList {
    private Book first;
    private AList rest;
    public ConsBook(Book first, AList rest){
        this.first = first;
        this.rest = rest;
    }
}
