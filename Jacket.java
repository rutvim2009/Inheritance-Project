public class Jacket extends Clothing {
    protected String style;
    protected boolean hasHoodie;
    protected String innerMaterial;

    public Jacket(String c, String m, String b, String s, boolean hh, String im) {
        super(c, m, b);
        style = s;
        hasHoodie = hh;
        innerMaterial = im;
    }

    @Override
    public String toString() {
        return "This is a beautiful " + color + ", " + style + " jacket. This was given to us by " + brand + " and is made of " + material + "on the outside and " + innerMaterial + " on the inside."; 

    }
}
