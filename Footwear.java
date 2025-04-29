public class Footwear extends Clothing {
    protected String size;
    protected String type;

    public Footwear(String c, String m, String b, String s, String t) {
        super(c, m, b);
        size = s;
        type = t;
        price = Options.materials.get(String.valueOf(m)) + Options.brands.get(String.valueOf(b)) + Options.shoeSizes.get(String.valueOf(s)) + Options.shoeTypes.get(String.valueOf(t));
    }

    public String toString() {
        return "This is a " + Options.giveAdj() + " footwear set, of color " + color + " and made of a " + Options.giveAdj() + " " + material + " material. " + brand + " has graciously given us this item. With a size of " + size + " and of type " + type + ", we know that this item is one for the history books!";
    }
}