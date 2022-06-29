import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class DiceRollSimulator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberDiceRolls = 0;
        // Get from user the number of times to roll the dice  
        System.out.println("How many dice rolls would you like to simulate?");
        numberDiceRolls = keyboard.nextInt();
        keyboard.nextLine();

        // Call the rollDice method passing in the number of dice rolls to be performed
        RollDice(numberDiceRolls);
    }
    // Method for rolling dice and passing rolls into an ArrayList
    public static void RollDice(int numberDiceRolls) {
        Random random = new Random();
        // Array list to store all the rolls 
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        int rollOne = 0;
        int rollTwo = 0;
        // Simulate dice rolls with random number generator, sum two values and push result
        // into rolls ArrayList
        for(int i = 0; i < numberDiceRolls; i++) {
            rollOne = random.nextInt(6) +1;
            rollTwo = random.nextInt(6) +1;
            int sum = rollOne + rollTwo;
            rolls.add(sum);
        }
        // Call DiceRollHistogram passing in rolls ArrayList as an argument
        SummationDiceRolls(rolls);
    }

    // Counts the number of occurrences for each possible outcome
    public static void SummationDiceRolls(ArrayList<Integer> rolls) {
        double numberRolls = rolls.size();
        double numberTwos = 0;
        double numberThrees = 0;
        double numberFours = 0;
        double numberFives = 0;
        double numberSixes = 0;
        double numberSevens = 0;
        double numberEights = 0;
        double numberNines = 0;
        double numberTens = 0;
        double numberElevens = 0;
        double numberTwelves = 0;
        for(int i = 0; i < rolls.size(); i++) {
            switch (rolls.get(i)) {
                case(2): {
                    numberTwos++;
                    break;
                }
                case(3): {
                    numberThrees++;
                    break;
                }
                case(4): {
                    numberFours++;
                    break;
                }
                case(5): {
                    numberFives++;
                    break;
                }
                case(6): {
                    numberSixes++;
                    break;
                }
                case(7): {
                    numberSevens++;
                    break;
                }
                case(8): {
                    numberEights++;
                    break;
                }
                case(9): {
                    numberNines++;
                    break;
                }
                case(10): {
                    numberTens++;
                    break;
                }
                case(11): {
                    numberElevens++;
                    break;
                }
                case(12): {
                    numberTwelves++;
                    break;
                }
            }
        }
        int percentageTwos = (int) Math.round((numberTwos/numberRolls)*100);
        // Convert each number into a percentage of total rolls, rounded to int. 
        int percentageThrees = (int) Math.round((numberThrees/numberRolls)*100);
        int percentageFours = (int) Math.round((numberFours/numberRolls)*100);
        int percentageFives = (int) Math.round((numberFives/numberRolls)*100);
        int percentageSixes = (int) Math.round((numberSixes/numberRolls)*100);
        int percentageSevens = (int) Math.round((numberSevens/numberRolls)*100);
        int percentageEights = (int) Math.round((numberEights/numberRolls)*100);
        int percentageNines = (int) Math.round((numberNines/numberRolls)*100);
        int percentageTens = (int) Math.round((numberTens/numberRolls)*100);
        int percentageElevens = (int) Math.round((numberElevens/numberRolls)*100);
        int percentageTwelves = (int) Math.round((numberTwelves/numberRolls)*100);
        // Call GenerateHistogram method to create a system output line for each #
        System.out.println("DICE ROLLING SIMULATION RESULTS");
        System.out.println("Each \"*\" represents 1% of the total number of rolls.");
        System.out.println("Total number of rolls = " + numberRolls);
        System.out.println("2: " + GenerateHistogram(percentageTwos));
        System.out.println("3: " + GenerateHistogram(percentageThrees));
        System.out.println("4: " + GenerateHistogram(percentageFours));
        System.out.println("5: " + GenerateHistogram(percentageFives));
        System.out.println("6: " + GenerateHistogram(percentageSixes));
        System.out.println("7: " + GenerateHistogram(percentageSevens));
        System.out.println("8: " + GenerateHistogram(percentageEights));
        System.out.println("9: " + GenerateHistogram(percentageNines));
        System.out.println("10: " + GenerateHistogram(percentageTens));
        System.out.println("11: " + GenerateHistogram(percentageElevens));
        System.out.println("12: " + GenerateHistogram(percentageTwelves));
    }

    public static String GenerateHistogram(int numberRolls) {
        String resultHistogram = "";
        for(int i = 0; i < numberRolls; i++) {
            resultHistogram = resultHistogram + "*";
        }
        return resultHistogram;
    }
}