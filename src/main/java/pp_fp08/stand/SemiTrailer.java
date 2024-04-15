
package pp_fp08.stand;

public class SemiTrailer extends Trailer {
    
    private int spareTyreNumber;
    
    public SemiTrailer(int load, int spareTyreNumber) {
        super(load);
        this.spareTyreNumber = spareTyreNumber;
    }
    
    @Override
    public String trailerToString() {
        return super.trailerToString() + "\nNumber of spre tyres: " + spareTyreNumber;
    }
}
