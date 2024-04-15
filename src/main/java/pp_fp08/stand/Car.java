package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;

public class Car extends Vehicle {

    private int occupantsNumber;
    private int doorsNumber;

    public Car(int kms, int price, int vinNumber, String brand, String model, String manufacturingDate, Origin origin, Condition condition, int occupantsNumber, int doorsNumber, boolean forSale) {
        super(kms, price, vinNumber, brand, model, manufacturingDate, origin, condition, forSale);
        this.doorsNumber = doorsNumber;
        this.occupantsNumber = occupantsNumber;
        this.setPrice(price);
    }
    
    @Override
    protected void setPrice(int price) {
        double discount = 0.3;

        if (getCondition() == Condition.USED) {
            double newPrice = price - (price * discount);
            super.setPrice((int) newPrice);
        } else {
            super.setPrice(price);
        }
    }

    @Override
    public String vehicleToString() {
        return super.vehicleToString() + "\nOccupants number: " + occupantsNumber + "\nDoors number: " + doorsNumber;

    }

}
