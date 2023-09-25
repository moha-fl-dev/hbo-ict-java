package taxes;

import java.util.List;

public class Company extends CanOwnProperty {

    public Company(List<RentableProperty> rentableProperties){
        super(rentableProperties);
    }

     @Override
    public double calculateTax(){
        double totalTaxes = 0;

        for(RentableProperty rentableProperty : this.rentableProperties){
            if(rentableProperty.companyOwned){
                totalTaxes += rentableProperty.calculateTax();
            }
        }

        return totalTaxes;
    }

}