import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Instrument> inventory;

    public Inventory(List<Instrument> inventory) {
        this.inventory = inventory;
    }

    public void addInstrument(String serialNumber, double price,
                              InstrumentSpec guitarSpec) {
        Instrument instrument;
        if (guitarSpec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) guitarSpec);
        } else {
            instrument = new Mandolin(serialNumber, price, guitarSpec);
        }
        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec spec) {
        List<Instrument> matchingInstruments = new ArrayList<>();
        for (Instrument instrument : inventory) {
            InstrumentSpec instrumentSpec = instrument.getSpec();
            if (instrumentSpec.matches(spec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}