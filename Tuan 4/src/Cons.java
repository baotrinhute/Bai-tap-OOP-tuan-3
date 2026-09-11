public class Cons extends AList{
    private Package first;
    private AList rest;
    public Cons(Package first, AList rest){
        this.first = first;
        this.rest = rest;
    }
}
