import java.util.LinkedList;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory(new LinkedList<>());
        initializeInventory(inventory);

        findMatching(inventory, new GuitarSpec(Builder.FENDER, "Stratocaster",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));

        System.out.println("\nLooking for a mandolin...");


        findMatching(inventory, new MandolinSpec(Builder.FENDER, "Stratocaster",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.F));

    }

    private static void findMatching(final Inventory inventory, final InstrumentSpec whatErinLikes) {
        List<Instrument> matchingInstruments = inventory.search(whatErinLikes);
        if (!matchingInstruments.isEmpty()) {
            for (Instrument match : matchingInstruments) {
                if (match != null) {
                    InstrumentSpec instrumentSpec = match.getSpec();
                    System.out.println("Erin, you might like this " +
                            instrumentSpec.getBuilder() + " " + instrumentSpec.getModel() + " " +
                            instrumentSpec.getType() + " instrument:\n   " +
                            instrumentSpec.getBackWood() + " back and sides,\n   " +
                            instrumentSpec.getTopWood() + " top.\nYou can have it for only $" +
                            match.getPrice() + "!");
                }
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {

        inventory.addInstrument("11277", 3999.95, new MandolinSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER, Style.F));
        inventory.addInstrument("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER, 6));
        inventory.addInstrument("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER, 6));
        inventory.addInstrument("122784", 5495.95, new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC,
                Wood.MAHOGANY, Wood.ADIRONDACK, 6));
        inventory.addInstrument("76531", 6295.95, new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 6));
        inventory.addInstrument("70108276", 2295.95, new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAPLE, 6));
        inventory.addInstrument("82765501", 1890.95, new GuitarSpec(Builder.GIBSON, "SG '61 Reissue",
                Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 6));
        inventory.addInstrument("77023", 6275.95, new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 6));
        inventory.addInstrument("1092", 12995.95, new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC,
                Wood.INDIAN_ROSEWOOD, Wood.CEDAR, 6));
        inventory.addInstrument("566-62", 8999.95, new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC,
                Wood.COCOBOLO, Wood.CEDAR, 12));
        inventory.addInstrument("6 29584", 2100.95, new GuitarSpec(Builder.PRS, "Dave Navarro Signature",
                Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 6));
    }
}