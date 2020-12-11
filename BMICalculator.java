import java.util.Scanner;

public class BMICalculator{

    public static void main(String[] args){

        Calculation calculate = new Calculation();

        calculate.theLoop();

    }

}

class Calculation{

    Scanner scanner = new Scanner(System.in);

    private double height;
    private double weight;
    private double BMI;


    void setHeight(int amount){

        this.height = amount;

    }

    void setWeight(int amount2){

        this.weight = amount2;

    }

    void setBMI(double height, double weight){
        
        this.BMI = weight/(height/100*height/100);

    }

    void showMenu(){

        System.out.print("\nEnter your height(cm): ");

        int userHeight = scanner.nextInt();

        setHeight(userHeight);

        System.out.print("\nEnter your weight(kg): ");

        int userWeight = scanner.nextInt();

        setWeight(userWeight);

        setBMI(height, weight);

        System.out.println("---------------------------------------------");

        System.out.println("Your BMI is: " + BMI);

        System.out.println("---------------------------------------------");

    }


    void theLoop(){

        do {

            showMenu();

            System.out.println("Would you like to convert again? (Y/N)");

            String userAnswer = scanner.next();

            switch (userAnswer){

                case "Y":

                break;

                case "N":

                System.out.println("\nGoodbye!\n");

                System.exit(0);

                break;

                default:

                System.out.println("\nThat's not an option");

                System.out.println("\nYou're getting kicked for that\n");

                System.exit(0);

            }

        } while (1 != 0);

    }

}