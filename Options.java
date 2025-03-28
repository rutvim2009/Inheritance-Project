public class Options {
    public String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "pink", "brown", "white", "black", "gray", "scarlet", "azure", "teal", "amber", "violet", "cyan"};
    public String[] materials = {"cotton", "wool", "linen", "silk", "denim", "satin", "leather", "polyester"};
    public String[] brands = {"Gucci", "Louis Vuitton", "Prada", "Nike", "Adidas", "H&M", "Zara"};
    public String[] clothingSizes = {"XS", "S", "M", "L", "XL", "XXL", "XXXL"};
    public double[] shoeSizes = {5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10, 10.5, 11, 11.5, 12, 12.5, 13, 13.5, 14};
    public String[] patterns = {"stripes", "plaid", "polka dots", "camo", "floral", "tie-dye", "lace", "chevron", "leopard print", "zebra print"};
    public String[] adj = {"formal", "elegant", "sophisticated", "comfortable", "simple", "casual", "fashional", "stylish", "plain", "beautiful", "vintage"};
    public String[] dressLengths = {"mini", "midi", "maxi"};
    public String[] sleeveTypes = {"bishop", "bell", "raglan", "poet", "puffed", "kimono", "circular", "peasant", "marie", "layered", "petal", "lantern", "french", "puffed"};
    public String[] bodices = {"princess", "asymmetrical", "strapless", "tubeless", ""};
    public String[] shoeTypes = {"loafers", "sneakers", "heels", "sandals", "flats", "flip flops", "platforms", "boots", "stilettos", "wedges"};
    public boolean[] formalOrNot = {true, false};


    public String giveColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

    public String giveMaterial() {
        int index = (int) (Math.random() * materials.length);
        return materials[index];
    }

    public String giveBrand() {
        int index = (int) (Math.random() * brands.length);
        return brands[index];
    }

    public String giveClothingSize() {
        int index = (int) (Math.random() * clothingSizes.length);
        return clothingSizes[index];
    }

    public double giveShoeSize() {
        int index = (int) (Math.random() * shoeSizes.length);
        return shoeSizes[index];
    }

    public String givePattern() {
        int index = (int) (Math.random() * patterns.length);
        return patterns[index];
    }

    public String giveAdj() {
        int index = (int) (Math.random() * adj.length);
        return adj[index];
    }
    
    public String giveSleeveType() {
        int index = (int) (Math.random() * sleeveTypes.length);
        return sleeveTypes[index];
    }

    public String giveBodice() {
        int index = (int) (Math.random() * bodices.length);
        return bodices[index];
    }

    public String giveShoeType() {
        int index = (int) (Math.random() * shoeTypes.length);
        return shoeTypes[index];
    }

    public boolean giveIsFormal() {
        int index = (int) (Math.random() * formalOrNot.length);
        return formalOrNot[index];
    }
}

