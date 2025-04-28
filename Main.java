import java.util.*;
//import java.io.*;

public class Main {
    public static void main (String[] args) {


<<<<<<< HEAD
        System.out.println("Hello, judge! Welcome to Dress to Impress! We have several outfits lined up for you. Every round, we will give you three outfits to rank. If your ranking matches the ranking of the audience, you will get points! But, be warned, if your rankings do not satisfy the likings of the audience, we will kick you out of the judging panel. Let's proceed!");
=======
        System.out.println("Hello, judge! Welcome to Dress to Impress! We have several outfits lined up for you. Every round, we will give you three outfits to rank based on price. If your ranking correctly ranks the prices of the outfits, the manager will reward you points! But, be warned, if your rankings do not satisfy the likings of the manager, he will kick you out of the judging panel. Let's proceed!");



>>>>>>> a2eb51fb3f466941addeb4e8a1fa1c9891c63da4
        boolean isPassing = true;
        int numPoints = 0;
        int totalPoints = 0;

        while (isPassing) {
            Model p1 = new Model();
            Model p2 = new Model(true);
            Model p3 = new Model();

            List<Double> prices = Arrays.asList(p1.outfitPrice, p2.outfitPrice, p3.outfitPrice);
            


            System.out.println("Model 1:");
            p1.giveModelInfo();
            System.out.println("Model 2:");
            p2.giveModelInfo();
            System.out.println("Model 3:");
            p3.giveModelInfo();

            System.out.println("Rank the models from least expensive to most expensive! Use the numbers 1, 2, and 3 separated by commas.");
            Scanner input = new Scanner(System.in);
            int scoreThisRound = getJudgeScore(input, );
            numPoints += scoreThisRound;
            totalPoints += 3;

            System.out.println("This is how many you got right this round: " + scoreThisRound);

            if ((double) numPoints/totalPoints < 0.3) {
                System.out.println("We regret to inform you that the manager is not pleased with your rankings. As such, you have been dismissed from the game. Try again next time!");
                isPassing = false;
            }
            else {
                System.out.println("You're doing great! Your ranking accuracy is: " + (double) numPoints/totalPoints + ". On to the next round!");
            }
                      
        }
    }

    
    public static int getJudgeScore(Scanner input, List<Integer> answer) {
        int score = 0;
        
        String line = input.nextLine(); 
        String[] parts = line.split(",");
        
        if (parts.length != 3) {
            System.out.println("Invalid input. Please enter three numbers separated by commas (e.g., 1,2,3).");
            return 0;
        }
        
        for (int i = 0; i < 3; i++) {
            try {
                int judgeRank = Integer.parseInt(parts[i].trim());
                if (judgeRank == answer.get(i)) {
                    score++;
                }
            } catch (NumberFormatException e) {
                    
                System.out.println("Invalid number format: " + parts[i]);
                    
                return 0;
            }
        }
        
        return score;
    }
        
    
}