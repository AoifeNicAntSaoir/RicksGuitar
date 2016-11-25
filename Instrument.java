public abstract class Instrument {
    protected final String serialNumber;
    protected final InstrumentSpec spec;
    protected double price;

    public Instrument(InstrumentSpec instrumentSpec, String serialNumber, double price) {
        this.spec = instrumentSpec;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public InstrumentSpec getSpec() {
      return spec;
    }

    public String getSerialNumber() {
      return serialNumber;
    }

    public double getPrice() {
      return price;
    }

    public void setPrice(float newPrice) {
      this.price = newPrice;
    }
}
