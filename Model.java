import java.util.*;
import java.io.*;

public class Model {
    public ArrayList<Clothing> piecesWorn;

    public Model() {
        piecesWorn = new ArrayList<>();
        Clothing top = new Shirt(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveClothingSize(), Options.giveIsFormal(), Options.givePattern());
        Clothing bottoms = new Bottoms(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveClothingSize());
        Clothing footwear = new Footwear(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveShoeSize(), Options.giveShoeType());
        Clothing jacket = new Jacket(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveJacketStyle(), Options.giveIsHoodie(), Options.giveMaterial());
        piecesWorn.add(top);
        piecesWorn.add(bottoms);
        piecesWorn.add(footwear);
        piecesWorn.add(jacket);
    }

    public Model(boolean isDress) {
        piecesWorn = new ArrayList<>();
        Clothing dress = new Dress(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveDressLength(), Options.giveSleeveType(), Options.giveBodice());
        Clothing bottoms = new Bottoms(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveClothingSize());
        Clothing footwear = new Footwear(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveShoeSize(), Options.giveShoeType());
        Clothing jacket = new Jacket(Options.giveColor(), Options.giveMaterial(), Options.giveBrand(), Options.giveJacketStyle(), Options.giveIsHoodie(), Options.giveMaterial());
        piecesWorn.add(dress);
        piecesWorn.add(bottoms);
        piecesWorn.add(footwear);
        piecesWorn.add(jacket);
    }

    public void giveModelInfo() {
        System.out.println("The model is wearing the following items:");
        for (Clothing item : piecesWorn) {
            System.out.println(item.toString());
        }
    }



}
