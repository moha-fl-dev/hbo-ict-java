package taxes;

import java.util.List;

public class Customer extends CanOwnProperty {

    public Customer(List<RentableProperty> rentableProperties){
        super(rentableProperties);
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}