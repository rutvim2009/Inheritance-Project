public class Dress extends Clothing {
    protected String length;
    protected String sleeveType;
    protected String bodice;

    public Dress(String c, String m, String b, String l, String s, String bo) {
        super(c, m, b);
        length = l;
        sleeveType = s;
        bodice = bo;
    }

    @Override
    public String toString() {
        return "This is a " + giveAdj() + " dress, with a " + color + " color, made of a " + material + " material. Having a " + length + " length, " + giveAdj() + " " + sleeve + " sleeve style, and a " + giveAdj() + " " + bodice + "bodice style, this piece is graciously given to us by " + brand + "."; 
    }
}