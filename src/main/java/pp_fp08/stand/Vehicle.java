package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;

public class Vehicle {

    private static int nextId = 0;

    private int kms;
    private int price;
    private int vinNumber;
    private int code = 0;
    private boolean forSale;
    private String brand;
    private String model;
    private String manufacturingDate;
    private Origin origin;
    private Condition condition;

    public Vehicle(int kms, int price, int vinNumber, String brand, String model, String manufacturingDate, Origin origin, Condition condition, boolean forSale) {
        this.kms = kms;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.origin = origin;
        this.condition = condition; 
        this.vinNumber = vinNumber;
        this.forSale = forSale;
        this.setCode();
       
    }

    protected Condition getCondition() {
        return condition;
    }

    protected int getVinNumber() {
        return vinNumber;
    }
    
    protected boolean getForSale() {
        return forSale;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    private void setCode() {
        this.code = nextId++;
    }
    
    public String vehicleToString() {
        return "\nVehicle code:" + code + "\nModel: " + model + "\nBrand: " + brand + "\nManufacturing date: " + manufacturingDate + "\nVin number: "
                + vinNumber + "\nOrigin: " + Origin.originToString(origin) + "\nCondition: " + Condition.conditionToString(condition)
                + "\nPrice: " + price + "€";
    }

}
