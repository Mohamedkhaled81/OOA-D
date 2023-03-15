package ChapterOne.RickG;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
    public String toString() {
        switch(this) {
            case ANY: return "Any";
            case PRS: return "Prs";
            case RYAN: return "Ryan";
            case OLSON: return "Olson";
            case FENDER: return "Fender";
            case GIBSON: return "Gibson";
            case MARTIN: return "Martin";
            case COLLINGS: return "Collings";
            default: return "Unspecified";
        }
    }

}
