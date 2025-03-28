public class Footwear extends Clothing {
    protected int size;
    protected String type;

    public Footwear(String c, String m, String b, int s, String t) {
        super(c, m, b);
        size = s;
        type = t;
    }

    public String toString() {
        return "This is a beautiful footwear set, of color " + color + " and made of a beautiful " + material + " material. " + brand + " has graciously given us this item. With a size of " + size + " and of type " + type + ", we know that this item is one for the history books!";
    }
}