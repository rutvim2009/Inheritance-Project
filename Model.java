import java.util.*;
import java.io.*;

public class Model {
    public ArrayList<Clothing> piecesWorn;

    public Model() {

        Clothing top = new Shirt(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveClothingSize(), Options.giveIsFormal(), Options.givePattern());
        Clothing bottoms = new Bottoms(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveClothingSize());
        Clothing footwear = new Footwear(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveShoeSize(), Options.giveShoeType());
        Clothing jacket = new Jacket(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveJacketStyle(), Options.giveIsHoodie(), Options.giveMaterial());
        piecesWorn.add(top);
        piecesWorn.add(bottoms);
        piecesWorn.add(footwear);
        piecesWorn.add(jacket);
    }



}
