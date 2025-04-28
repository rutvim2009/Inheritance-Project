public class Jacket extends Clothing {
    protected String style;
    protected boolean hasHoodie;
    protected String innerMaterial;
    public double price;

    public Jacket(String c, String m, String b, String s, boolean hh, String im) {
        super(c, m, b);
        style = s;
        hasHoodie = hh;
        innerMaterial = im;
        price = Options.materials.get(String.valueOf(m)) + Options.brands.get(String.valueOf(b)) + Options.jacketStyles.get(String.valueOf(s)) + Options.materials.get(String.valueOf(im));
    }

    @Override
    public String toString() {
        return "This is a " + Options.giveAdj() + " " + color + ", " + style + " jacket. This was given to us by " + brand + " and is made of " + material + "on the outside and " + innerMaterial + " on the inside."; 

    }
}
