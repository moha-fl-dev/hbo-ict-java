package taxes;

import java.util.List;

public abstract class CanOwnProperty implements Taxes {

    final List<RentableProperty> rentableProperties;

    public CanOwnProperty(List<RentableProperty> rentableProperties){
        this.rentableProperties = rentableProperties;
    }

}