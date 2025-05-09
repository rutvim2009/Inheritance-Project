public class Bottoms extends Clothing {
    protected String size;
    
    public Bottoms(String c, String m, String b, String s) {
        super(c, m, b);
        size = s;
        price = Options.materials.get(String.valueOf(m)) + Options.brands.get(String.valueOf(b)) + Options.clothingSizes.get(String.valueOf(s));
    }
    
    @Override
    public String toString() {
        return "Pants: A " + Options.giveAdj() + " " + size + " sized bottoms made of " + color + " " + material + ". Given to us by " + brand; 
    }   
}