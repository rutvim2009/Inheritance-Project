import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {


        System.out.println("Hello, judge! Welcome to Dress to Impress! We have several outfits lined up for you. Every round, we will give you three outfits to rank based on price. If your ranking correctly ranks the prices of the outfits, the manager will reward you points! But, be warned, if your rankings do not satisfy the likings of the manager, he will kick you out of the judging panel. Let's proceed!");



        boolean isPassing = true;
        int numUserPoints = 0;
        int totalPoints = 0;

        while (isPassing) {
            Model p1 = new Model();
            Model p2 = new Model(true);
            Model p3 = new Model();

            List<Double> prices = Arrays.asList(p1.outfitPrice, p2.outfitPrice, p3.outfitPrice);
            

            List<Integer> outfitPriceRanks = makeCorrectRanking(prices, p1, p2, p3); //compares the prices of all three models and correctly ranks them from least to most expensive


            System.out.println("Model 1:");
            p1.giveModelInfo();
            System.out.println("Model 2:");
            p2.giveModelInfo();
            System.out.println("Model 3:");
            p3.giveModelInfo();

            System.out.println("Rank the models from least expensive to most expensive! Use the numbers 1, 2, and 3 separated by commas.");
            Scanner input = new Scanner(System.in);
            int scoreThisRound = getJudgeScore(input, outfitPriceRanks);
            numUserPoints += scoreThisRound;
            totalPoints += 3;

            System.out.println("This is how many you got right this round: " + scoreThisRound);

            if ((double) numUserPoints/totalPoints < 0.3) {
                System.out.println("We regret to inform you that the manager is not pleased with your rankings. As such, you have been dismissed from the game. Try again next time!");
                isPassing = false;
            }
            else {
                System.out.println("You're doing great! Your ranking accuracy is: " + (double) numUserPoints/totalPoints + ". On to the next round!");
            }
                      
        }
    }

    
    public static List<Integer> makeCorrectRanking(List<Double> list, Model p1, Model p2, Model p3) {
        List<Integer> result = new ArrayList<Integer>(3);
        Collections.sort(list); //sorts prices from least to most expensive, but we don't know which price corresponds to which model

        for (int i = 0; i < 3; i++) {
            if (list.get(i) == p1.outfitPrice) {
                result.set(i, 1);
            }
            else if (list.get(i) == p2.outfitPrice) {
                result.set(i, 2);
            }
            else {result.set(i, 3);}
        }

        return result; 
    }

    public static int getJudgeScore(Scanner input, List<Integer> rightAnswers) {
        int result = 0;
        for (int i = 0; i < 2; i++) {
            if (input.nextInt() == rightAnswers.get(i)) {
                result++;
            }
        }

        return result;
    }
        
    
}