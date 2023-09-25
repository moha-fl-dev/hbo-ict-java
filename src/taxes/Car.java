package taxes;

public class Car extends RentableProperty {

    private static final double TAX_RATE = 21;
    public Car(double price, boolean companyOwned){
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