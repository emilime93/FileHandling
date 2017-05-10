package forelasning_printable;

/**
 * A class to represent a boat and it's properties.
 */
public class Boat implements Printable {

    private String manufacturer;
    private String model;

    Boat(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    private String getManufacturer() {
        return manufacturer;
    }

    private String getModel() {
        return model;
    }

    @Override
    public String generatePrintableRepresentation() {
        return String.format("A %s boat made by %s ", getModel(), getManufacturer());
    }
}
