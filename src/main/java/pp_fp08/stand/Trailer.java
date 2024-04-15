package pp_fp08.stand;

public class Trailer {

    private int axesNumber;
    private int load;

    public Trailer(int load) {
        this.axesNumber = 2;
        this.load = load;
    }
    
    public String trailerToString() {
        return "\nNumber of axes: " + axesNumber + "\nLoad: " + load;
    }
}
 