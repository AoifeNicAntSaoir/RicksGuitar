public abstract class InstrumentSpec {
    final Builder builder;
    final String model;
    final Type type;
    final Wood backWood;
    final Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.topWood = topWood;
        this.type = type;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
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

    public boolean matches(InstrumentSpec otherInstrument) {
        if (isSpecified(otherInstrument.getBuilder())){
            return this.builder == otherInstrument.getBuilder();
        }

        if (isModelSpecified(otherInstrument)) {
            return this.model.equals(otherInstrument.getModel());
        }

        if (isSpecified(otherInstrument.getType())) {
            return this.type == (otherInstrument.getType());
        }

        if (isSpecified(otherInstrument.getBackWood())) {
            return this.backWood == otherInstrument.getBackWood();
        }

        if (isSpecified(otherInstrument.getTopWood())){
            return this.topWood == otherInstrument.getTopWood();
        }
        return true;
    }

    private boolean isModelSpecified(InstrumentSpec otherInstrument) {
        return (otherInstrument.getModel() != null)
                && (!otherInstrument.getModel().equals(""));
    }

    private boolean isSpecified(Object field) {
        return field != null;
    }
}
