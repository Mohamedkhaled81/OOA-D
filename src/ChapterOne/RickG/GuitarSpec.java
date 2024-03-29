package ChapterOne.RickG;

public class GuitarSpec {
    private Builder builder;
    private Type type;
    private Wood backWood,  topWood;
    private String model;
    private int numStrings;

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, int numStrings) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }
    public int getNumStrings() {
        return numStrings;
    }
    public boolean matches(GuitarSpec otherSpec) {
        if(builder != otherSpec.getBuilder())
            return false;
        if((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
            return false;
        if (type != otherSpec.type)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;
        if (numStrings != otherSpec.numStrings)
            return false;
        return true;
    }
}
