public class Shirt extends Clothing{
    protected String size;
    protected boolean isFormal;
    protected String pattern;

    public Shirt(String c, String m, String b, String s, boolean f, String p) {
        super(c, m, b);
        size = s;
        isFormal = f;
        pattern = p;
        price = Options.materials.get(String.valueOf(m)) + Options.brands.get(String.valueOf(b)) + Options.clothingSizes.get(String.valueOf(s));
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
        return "Shirt: A " + Options.giveAdj() + " " + isItFormal() + " shirt, with a " + Options.giveAdj() + " " + color + " color, made of a " + Options.giveAdj() + " " + material + " material. With a " + Options.giveAdj() + " pattern of " + pattern + " and a size of " + size + ", this piece is graciously given to us by " + brand + "."; 
    }
}