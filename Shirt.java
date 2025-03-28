public class Shirt extends Clothing{
    protected String size;
    protected boolean isFormal;
    protected String pattern;

    public Shirt(String c, String m, String b, String s, boolean f, String p) {
        super(c, m, b);
        size = s;
        isFormal = f;
        pattern = p;
    }

    public String isItFormal() {
        if (isFormal) {
            return "formal";
        }

        else {
            return "casual";
        }
    }

    @Override

    public String toString() {
        return "This is a beautiful " + isItFormal() + " shirt, with a beautiful " + color + " color, made of a beautiful " + material + " material. With a beautiful pattern of " + pattern + " and a size of " + size + ", this piece is given to us by " + brand + "."; 
    }
}