package ChapterOne.RickG;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
    public String toString() {
        switch(this) {
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian Rosewood";
            case MAHOGANY:
                return "Mahogany";
            case ALDER:
                return "Alder";
            case CEDAR:
                return "Cedar";
            case MAPLE:
                return "Maple";
            case SITKA:
                return "Stika";
            case COCOBOLO:
                return "Coco";
            case ADIRONDACK:
                return "Adirondack";
            default: return "unspecified";
        }
    }

}
