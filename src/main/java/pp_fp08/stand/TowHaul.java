package pp_fp08.stand;

import pp_fp08.enums.TrailerType;

public class TowHaul extends Trailer {

    private TrailerType trailerType;

    public TowHaul(int load, TrailerType trailerType) {
        super(load);
        this.trailerType = trailerType;
    }
    
    @Override
    public String trailerToString() {
        return super.trailerToString() + "\nTrailer type: " + TrailerType.trailerToString(trailerType);
    }

}
