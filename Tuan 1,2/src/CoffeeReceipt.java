import junit.framework.TestCase;

import static junit.framework.Assert.assertEquals;
public class CoffeeReceipt {
    private String kind;
    private double pricePerPound;
    private double weight;

    public CoffeeReceipt(String kind, double pricePerPound, double weight) {
        this.kind = kind;
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }

    //to compute the total cost of this coffee purchase [in cents]
    public double sellingCost() {
        return this.pricePerPound * this.weight;
    }

    public boolean weighsMore(double amount){
        return this.weight > amount;
    }

    public boolean isCheaperThan(CoffeeReceipt that){
        return this.pricePerPound < that.pricePerPound;
    }

    public double Discount(){
        if(this.sellingCost() < 5000.00) return this.sellingCost();
        if(this.sellingCost() > 5000.00 && this.sellingCost() < 20000.00) return this.sellingCost() * 0.8;
        return this.sellingCost() * 0.75;
    }
}

