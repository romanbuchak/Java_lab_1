package ua.lviv.iot.Java_lab_1;

public record AEP(String name, int numberOfZone, double maxPowerInKilowatt, String color, double price,
                  double levelOfTurn) {
    private static final String material = "plastic";

    public AEP() {
        this("ABB", 3, 2, "blue", 1200, 380);
    }

    public AEP(String name, double maxPowerInKilowatt, double price) {
        this(name, 1, maxPowerInKilowatt, "black", price, 110);
    }

    public AEP(String name, int numberOfZone, double maxPowerInKilowatt, String color, double price, double levelOfTurn) {
        this.name = name;
        this.numberOfZone = numberOfZone;
        this.maxPowerInKilowatt = maxPowerInKilowatt;
        this.color = color;
        this.price = price;
        this.levelOfTurn = levelOfTurn;
    }

    @Override
    public String toString() {
        return "The name is: " + this.name + "\nNumber of zone: " + this.numberOfZone +
                "\nMax power in kilowatt: " + this.maxPowerInKilowatt + "\nColor: " + this.color +
                "\nPrice: " + this.price + "\nLevel of exclusion: " + this.levelOfTurn + "\n";
    }

    public static String getStaticField() {
        return material;
    }
}
