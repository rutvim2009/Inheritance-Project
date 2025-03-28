public class Dress extends Clothing {
    protected String length;
    protected String sleeveType;
    protected String bodice;


    @Override
    public String toString() {
        return "This is a beautiful dress, with a " + color + " color, made of a " + material + " material. Having a " + length + " length, beautiful " + sleeve + " sleeve style, and a beautiful " + bodice + "bodice style, this piece is graciously given to us by " + brand + "."; 

    }
}