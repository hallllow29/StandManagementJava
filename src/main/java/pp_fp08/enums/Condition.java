package pp_fp08.enums;

public enum Condition {
    NEW,
    USED;

    public static String conditionToString(Condition condition) {
        switch (condition) {
            case NEW:
                return "New vehicle";
            default:
                return "Used vehicle";
        }
    }
}
