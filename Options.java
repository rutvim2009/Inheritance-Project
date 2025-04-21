public class Options {
    public static String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "pink", "brown", "white", "black", "gray", "scarlet", "azure", "teal", "amber", "violet", "cyan"};
    public static String[] materials = {"cotton", "wool", "linen", "silk", "denim", "satin", "leather", "polyester"};
    public static String[] brands = {"Gucci", "Louis Vuitton", "Prada", "Nike", "Adidas", "H&M", "Zara"};
    public static String[] clothingSizes = {"XS", "S", "M", "L", "XL", "XXL", "XXXL"};
    public static double[] shoeSizes = {5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10, 10.5, 11, 11.5, 12, 12.5, 13, 13.5, 14};
    public static String[] patterns = {"stripes", "plaid", "polka dots", "camo", "floral", "tie-dye", "lace", "chevron", "leopard print", "zebra print"};
    public static String[] adj = {"formal", "elegant", "sophisticated", "comfortable", "simple", "casual", "fashional", "stylish", "plain", "beautiful", "vintage"};
    public static String[] dressLengths = {"mini", "midi", "maxi"};
    public static String[] sleeveTypes = {"bishop", "bell", "raglan", "poet", "puffed", "kimono", "circular", "peasant", "marie", "layered", "petal", "lantern", "french", "puffed"};
    public static String[] bodices = {"princess", "asymmetrical", "strapless", "tubeless", ""};
    public static String[] shoeTypes = {"loafers", "sneakers", "heels", "sandals", "flats", "flip flops", "platforms", "boots", "stilettos", "wedges"};
    public static boolean[] formalOrNot = {true, false};
    public static String[] jacketStyles = {"zip up", "leather", "furcoat", "trenchcoat", "hoodie", "bomber", "varsity", "parka"};
    public static boolean[] hoodieOrNot = {true, false};

    public static String[] outfits = {"Dress", "Shirt"};
    //public static String[] 

    public static String giveColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

    public static String giveMaterial() {
        int index = (int) (Math.random() * materials.length);
        return materials[index];
    }

    public static String giveBrand() {
        int index = (int) (Math.random() * brands.length);
        return brands[index];
    }

    public static String giveClothingSize() {
        int index = (int) (Math.random() * clothingSizes.length);
        return clothingSizes[index];
    }

    public static double giveShoeSize() {
        int index = (int) (Math.random() * shoeSizes.length);
        return shoeSizes[index];
    }

    public static String givePattern() {
        int index = (int) (Math.random() * patterns.length);
        return patterns[index];
    }

    public static String giveAdj() {
        int index = (int) (Math.random() * adj.length);
        return adj[index];
    }

    public static String giveDressLength() {
        int index = (int) (Math.random() * dressLengths.length);
        return dressLengths[index];
    }
    
    public static String giveSleeveType() {
        int index = (int) (Math.random() * sleeveTypes.length);
        return sleeveTypes[index];
    }

    public static String giveBodice() {
        int index = (int) (Math.random() * bodices.length);
        return bodices[index];
    }

    public static String giveShoeType() {
        int index = (int) (Math.random() * shoeTypes.length);
        return shoeTypes[index];
    }

    public static boolean giveIsFormal() {
        int index = (int) (Math.random() * formalOrNot.length);
        return formalOrNot[index];
    }

    public static String giveJacketStyle() {
        int index = (int) (Math.random() * jacketStyles.length);
        return jacketStyles[index];
    }

    public static boolean giveIsHoodie() {
        int index = (int) (Math.random() * hoodieOrNot.length);
        return hoodieOrNot[index];
    }
}

