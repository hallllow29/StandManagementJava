package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;

public class Motorcycle extends Vehicle {

    private int cubicCapacity;
    private int wheelSize;

    public Motorcycle(int kms, int price, int vinNumber, String brand, String model, String manufacturingDate, Origin origin, Condition condition, int cubicCapacity, int wheelSize, boolean forSale) {
        super(kms, price, vinNumber, brand, model, manufacturingDate, origin, condition, forSale);
        this.cubicCapacity = cubicCapacity;
        this.wheelSize = wheelSize;

    }
    
    @Override
    public String vehicleToString() {
        return super.vehicleToString() + "\nCubic Capacity: " + cubicCapacity + "\nWheel size: " + wheelSize;
    }

}
