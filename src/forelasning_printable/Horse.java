package forelasning_printable;

/**
 * A class to represent a horse and it's properties.
 */
public class Horse implements Printable{

    private String race;
    private double weight;
    private double height;

    Horse(String race, double weight, double height) {
        this.race = race;
        this.weight = weight;
        this.height = height;
    }

    private String getRace() {
        return race;
    }

    private double getWeight() {
        return weight;
    }

    private double getHeight() {
        return height;
    }

    @Override
    public String generatePrintableRepresentation() {
        return String.format("A %s horse that weighs %.2f kgs and is %.2f centimeters high", getRace(), getWeight(), getHeight());
    }
}
