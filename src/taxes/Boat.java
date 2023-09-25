package taxes;

public class Boat extends RentableProperty {
    private static final double TAX_RATE = 0.85;

    public Boat(double price, boolean companyOwned) {
        super(price, companyOwned);
    }

    @Override
    public double calculateTax() {
        return (TAX_RATE / 100) * this.getPrice();
    }

    @Override
    public double getTaxRate(){
        return TAX_RATE;
    }
}