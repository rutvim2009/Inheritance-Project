public class Bottoms extends Clothing {
    protected String size;
    public double price;
    
    public Bottoms(String c, String m, String b, String s) {
        super(c, m, b);
        size = s;
        price = Options.materials.get(m) + Options.brands.get(b) + Options.clothingSizes.get(s);
    }
    
    @Override
    public String toString() {
        return "This is a " + Options.giveAdj() + size + "sized bottom made of " + color + material + ". This was given to us by " + brand; 
    }   
}