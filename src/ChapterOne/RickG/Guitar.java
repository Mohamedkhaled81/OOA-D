package ChapterOne.RickG;

public class Guitar {
    private double price;
    private String serialNumber;
    private GuitarSpec spec;
    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
    public GuitarSpec getSpec() {
        return spec;
    }
}
