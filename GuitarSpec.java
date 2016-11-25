public class GuitarSpec extends InstrumentSpec {


    final int numStrings;

    public GuitarSpec(final Builder builder,
                      final String model,
                      final Type type,
                      final Wood backWood,
                      final Wood topWood,
                      final int numStrings) {
        super(builder, model, type, topWood, backWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(final InstrumentSpec otherSpec) {
        if (!(otherSpec instanceof GuitarSpec))
            return false;
        if (!super.matches(otherSpec))
            return false;
        GuitarSpec spec = (GuitarSpec)otherSpec;
        return numStrings == spec.numStrings;
    }

}