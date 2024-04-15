package pp_fp08.enums;

public enum TrailerType {
    TRIPPER,
    OPEN,
    CLOSED,
    FRIDGE;

    public static String trailerToString(TrailerType type) {
        switch (type) {
            case TRIPPER:
                return "Tripper trailer";
            case OPEN:
                return "Open trailer";
            case CLOSED:
                return "Closed trailer";
            default:
                return "Fridge trailer";
        }
    }
}
