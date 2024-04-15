package pp_fp08.enums;

public enum TruckType {
    TRUCK,
    TIR;

    public static String truckTypeToString(TruckType type) {
        switch (type) {
            case TRUCK:
                return "Truck";
            default:
                return "TIR";
        }
    }
}
