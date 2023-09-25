import taxes.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        List<RentableProperty> rentableProperties = new ArrayList<>();

        Boat boat = new Boat(150, true);
        House house = new House(220, false);
        Car car = new Car(12500, true);

        System.out.printf("Tax rate for the boat is: %s. Total taxes is %s. \n", df.format(boat.getTaxRate()), df.format(boat.calculateTax()));
        System.out.printf("Tax rate for the house is: %s. Total taxes is %s. \n", df.format(house.getTaxRate()), df.format(house.calculateTax()));
        System.out.printf("Tax rate for the car is: %s. Total taxes is %s. \n", df.format(car.getTaxRate()), df.format(car.calculateTax()));

        rentableProperties.add(boat);
        rentableProperties.add(house);
        rentableProperties.add(car);

        Company rentX = new Company(rentableProperties);
        Customer John = new Customer(rentableProperties);

        System.out.printf("Total taxes for rentX is %s. \n", df.format(rentX.calculateTax()));
        System.out.printf("Total taxes for john is %s. \n", df.format(John.calculateTax()));

    }
}