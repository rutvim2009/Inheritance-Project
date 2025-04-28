import java.util.*;
//import java.io.*;

public class Options {
<<<<<<< HEAD
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
=======
 public static String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "pink", "brown", "white", "black", "gray", "scarlet", "azure", "teal", "amber", "violet", "cyan"};

 public static Map<String, Double> materials = Map.of(
 "cotton", 10.00, "wool", 25.00, "linen", 15.00, "silk", 35.00,
 "denim", 15.00, "satin", 7.50, "leather", 15.00, "polyester", 4.00, "nylon", 7.50
 );
>>>>>>> a2eb51fb3f466941addeb4e8a1fa1c9891c63da4

 public static Map<String, Double> brands = Map.of(
 "Gucci", 300.0, "Louis Vuitton", 350.0, "Prada", 320.0,
 "Nike", 90.0, "Adidas", 85.0, "H&M", 25.0, "Zara", 40.0
 );

 public static Map<String, Double> clothingSizes = Map.of(
 "XS", 0.0, "S", 0.0, "M", 0.0, "L", 0.0, "XL", 0.0, "XXL", 2.0, "XXXL", 4.0
 );

 public static Map<String, Double> shoeSizes = Map.of(
 "6", 1.0, "6.5", 1.0, "7", 1.0, "7.5", 1.0,
 "8", 1.5, "8.5", 1.5, "9", 1.5, "9.5", 1.5, "10", 2.0, "10.5", 2.0
 );

 public static Map<String, Double> dressLengths = Map.of(
 "mini", 15.0, "midi", 20.0, "maxi", 25.0
 );

 public static Map<String, Double> sleeveTypes = Map.of(
 "bishop", 8.0, "bell", 6.0, "poet", 7.0, "puffed", 6.0,
 "kimono", 10.0, "circular", 9.0, "peasant", 5.0,
 "petal", 6.0, "lantern", 8.0, "french", 5.0
 );

 public static Map<String, Double> bodices = Map.of(
 "princess", 15.0, "asymmetrical", 12.0, "strapless", 10.0, "tubeless", 8.0
 );

 public static Map<String, Double> shoeTypes = Map.of(
 "loafers", 50.0, "sneakers", 70.0, "heels", 90.0, "sandals", 40.0,
 "flats", 35.0, "flip flops", 15.0, "platforms", 80.0,
 "boots", 100.0, "stilettos", 120.0, "wedges", 75.0
 );

 public static Map<String, Double> jacketStyles = Map.of(
 "zip up", 50.0, "leather", 150.0, "furcoat", 250.0,
 "trenchcoat", 120.0, "hoodie", 40.0, "bomber", 80.0,
 "varsity", 100.0, "parka", 130.0
 );

 public static String[] patterns = {"stripes", "plaid", "polka dots", "camo", "floral", "tie-dye", "lace", "chevron", "leopard print", "zebra print"};
 public static String[] adj = {"formal", "elegant", "sophisticated", "comfortable", "simple", "casual", "fashional", "stylish", "plain", "beautiful", "vintage"};
 public static boolean[] formalOrNot = {true, false};
 public static boolean[] hoodieOrNot = {true, false};

 public static String[] outfits = {"Dress", "Shirt"};

 // Random entry from a map
 private static <K, V> Map.Entry<K, V> getRandomEntry(Map<K, V> map) {
 List<Map.Entry<K, V>> entries = new ArrayList<>(map.entrySet());
 return entries.get(new Random().nextInt(entries.size()));
 }

 public static Map.Entry<String, Double> giveMaterial() {
 return getRandomEntry(materials);
 }

 public static Map.Entry<String, Double> giveBrand() {
 return getRandomEntry(brands);
 }

 public static Map.Entry<String, Double> giveClothingSize() {
 return getRandomEntry(clothingSizes);
 }

 public static Map.Entry<String, Double> giveShoeSize() {
 return getRandomEntry(shoeSizes);
 }

 public static Map.Entry<String, Double> giveDressLength() {
 return getRandomEntry(dressLengths);
 }

 public static Map.Entry<String, Double> giveSleeveType() {
 return getRandomEntry(sleeveTypes);
 }

 public static Map.Entry<String, Double> giveBodice() {
 return getRandomEntry(bodices);
 }

 public static Map.Entry<String, Double> giveShoeType() {
 return getRandomEntry(shoeTypes);
 }

 public static Map.Entry<String, Double> giveJacketStyle() {
 return getRandomEntry(jacketStyles);
 }

 // Remaining methods unchanged
 public static String giveColor() {
 int index = (int) (Math.random() * colors.length);
 return colors[index];
 }

 public static String givePattern() {
 int index = (int) (Math.random() * patterns.length);
 return patterns[index];
 }

 public static String giveAdj() {
 int index = (int) (Math.random() * adj.length);
 return adj[index];
 }

 public static boolean giveIsFormal() {
 int index = (int) (Math.random() * formalOrNot.length);
 return formalOrNot[index];
 }

 public static boolean giveIsHoodie() {
 int index = (int) (Math.random() * hoodieOrNot.length);
 return hoodieOrNot[index];
 }
}