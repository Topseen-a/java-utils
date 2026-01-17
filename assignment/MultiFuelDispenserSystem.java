import java.util.Scanner;
import java.time.LocalDate;

public class MultiFuelDispenserSystem{

    static String[] fuelNames = {"Petrol", "Diesel", "Kerosine", "Gas"};
    static int[] fuelPrice = {739,1600,958,1000};
    static String[] fuelHistory = new String[50];
    static int[] litreHistory = new int[50];
    static int[] amountHistory = new int[50];
    static int[] historyDate = new String[50];
    static int transactionCount = 0;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    
        System.out.println("Welcome to our Filling Station");
        int choice = -1;

        while (choice != 0){
            System.out.println("\n Available Petroleum");
            System.out.println("1. Buy Petroleum");
            System.out.println("2. Show Transaction History");
            System.out.println("0. Exit");

            System.out.print("Choose an option");
            choice = input.nextInt();

            switch (choice){
                case 1: 
            }
            
        }
    }

    public static void buyFuel(Scanner input){
        System.out.print("Choose an option: ");
        int fuelChoice = input.nextInt();

        if (fuelChoice < 1 || fuelChoice > fuelNames.length){
            System.out.println("Invalid choice");
            return;
        }
        
        int index = fuelChoice - 1;
        String fuelName = fuelNames[index];
        int price = fuelPrices[index];

        System.out.println("Litre or Amount: ").toLowerCase();
        String methodOfBuyingFuel = input.nextLine;

        switch (methodOfBuyingFuel){
            case "litre":
                
                break;
            
            case "Ammount":
    
                break;
        
            default:
                System.out.println("Invalid input");
        }
    }

}
