package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;
import pp_fp08.enums.TruckType;

public class HeavyVehicle extends Vehicle {

    private int length;
    private int load;
    private TruckType truckType;
    private Trailer trailer;

    public HeavyVehicle(int kms, int price, int vinNumber, String brand, String model, String manufacturingDate, Origin origin, Condition condition, int length, int load, TruckType truckType, Trailer trailer, boolean forSale) {
        super(kms, price, vinNumber, brand, model, manufacturingDate, origin, condition, forSale);
        this.length = length;
        this.load = load;
        this.trailer = trailer;
        this.truckType = truckType;
        this.trailer = trailer;
        this.setPrice(price);
    }

    @Override
    protected void setPrice(int price) {
        if (getCondition() == Condition.NEW) {
            if (this.trailer == null) {
                double newPrice = price - (price * 0.05);
                super.setPrice((int) newPrice);
            } else {
                super.setPrice(price);
            }
        } else {
            double newPrice = price - (price * 0.15);
            super.setPrice((int) newPrice);
        }
    }

    @Override
    public String vehicleToString() {
        return super.vehicleToString() + "\nLength: " + length + "\nLoad: " + load + "\nTruck type: " + TruckType.truckTypeToString(truckType) + "\nTrailer: " + trailerToString();
    }

    private String trailerToString() {
        if (trailer == null) {
            return "No trailer";
        }

        return trailer.trailerToString();
    }

}
