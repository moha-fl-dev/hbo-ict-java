package taxes;

public class House extends RentableProperty {

    private static final double TAX_RATE = 1.52;
    public House(double price, boolean companyOwned) {
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