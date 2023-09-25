package taxes;

public abstract class RentableProperty implements Taxes {

    private final double price;
    public boolean companyOwned;
    public RentableProperty(double price, boolean companyOwned){
        this.price = price;
        this.companyOwned = companyOwned;
    }

    abstract public double getTaxRate();

    public double getPrice() {
        return price;
    }
}