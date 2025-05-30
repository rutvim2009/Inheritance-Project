public class Clothing {
    protected String color;
    protected String material;
    protected String brand;
    protected double price;

    public Clothing(String c, String m, String b) {
        color = c;
        material = m;
        brand = b;
    }

    public String toString() {
        return "Clothing: A " + Options.giveAdj() + " piece of clothing, with a " + color + " color, made of a " + material + " material. This piece is graciously given to us by " + brand + ".";
    }

    public double getPrice() {
        return price;
    }

}