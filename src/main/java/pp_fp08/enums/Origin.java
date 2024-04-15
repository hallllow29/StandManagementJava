package pp_fp08.enums;

public enum Origin {
    NATIONAL,
    IMPORTED;

    public static String originToString(Origin origin) {
        switch (origin) {
            case NATIONAL:
                return "This vehicle is national";
            default:
                return "This vehicle is imported";

        }
    }
}
