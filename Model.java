import java.util.*;
//import java.io.*;

public class Model {
    public ArrayList<Clothing> piecesWorn;
    public double outfitPrice;

    public Model() {
        piecesWorn = new ArrayList<>();
        Clothing top = new Shirt(Options.giveColor(), Options.giveMaterial().getKey(), Options.giveBrand().getKey(), Options.giveClothingSize().getKey(), Options.giveIsFormal(), Options.givePattern());
        Clothing bottoms = new Bottoms(Options.giveColor(), Options.giveMaterial().getKey(), Options.giveBrand().getKey(), Options.giveClothingSize().getKey());
        Clothing footwear = new Footwear(Options.giveColor(), Options.giveMaterial().getKey(), Options.giveBrand().getKey(), Options.giveShoeSize().getKey(), Options.giveShoeType().getKey());
        Clothing jacket = new Jacket(Options.giveColor(), Options.giveMaterial().getKey(), Options.giveBrand().getKey(), Options.giveJacketStyle().getKey(), Options.giveIsHoodie(), Options.giveMaterial().getKey());
        piecesWorn.add(top);
        piecesWorn.add(bottoms);
        piecesWorn.add(footwear);
        piecesWorn.add(jacket);

        outfitPrice = top.getPrice() + bottoms.getPrice() + footwear.getPrice() + jacket.getPrice();
    }

    public Model(boolean isDress) {
        piecesWorn = new ArrayList<>();
        Clothing dress = new Dress(Options.giveColor(), Options.giveMaterial().getKey(), Options.giveBrand().getKey(), Options.giveDressLength().getKey(), Options.giveSleeveType().getKey(), Options.giveBodice().getKey());
        Clothing bottoms = new Bottoms(Options.giveColor(), Options.giveMaterial().getKey(), Options.giveBrand().getKey(), Options.giveClothingSize().getKey());
        Clothing footwear = new Footwear(Options.giveColor(), Options.giveMaterial().getKey(), Options.giveBrand().getKey(), Options.giveShoeSize().getKey(), Options.giveShoeType().getKey());
        Clothing jacket = new Jacket(Options.giveColor(), Options.giveMaterial().getKey(), Options.giveBrand().getKey(), Options.giveJacketStyle().getKey(), Options.giveIsHoodie(), Options.giveMaterial().getKey());
        piecesWorn.add(dress);
        piecesWorn.add(bottoms);
        piecesWorn.add(footwear);
        piecesWorn.add(jacket);

        outfitPrice = dress.getPrice() + bottoms.getPrice() + footwear.getPrice() + jacket.getPrice();
    }

    public void giveModelInfo() {
        System.out.println("The model is wearing the following items:");
        for (Clothing item : piecesWorn) {
            System.out.println(item.toString());
        }
    }



}
