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
                    buyFuel(input);
                    break;
    
                case 2:
                   showTransactionHistory();
                    break;
            
                case 3:
                    System.out.print("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, try again");
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

        System.out.println("Litre or Amount? ").toLowerCase();
        String methodOfBuyingFuel = input.nextLine;

        switch (methodOfBuyingFuel){
            case "litre":
                int litres;

                while (true){
                    System.out.print("How many litres of fuel are you buying? ");
                    litres = input.nextInt();

                    if (litres >= 1 && litres <= 50){
                        break;
                    }
                    else {
                        Sytem.out.println("Litres must be between 1-50");
                    }
                }
                
                int amount = litres * price;
                break;
            
            case "Ammount":
                int amount;

                while (true){
                    System.out.print("How much are you buying? ");
                    amount = input.nextInt();
        
                    if (amount >= price){
                        break;
                    }
                    else {
                        System.out.println("Amount must be more than litre price");
                    }           
                }

                int litres = amount / price;
                break;
        
            default:
                System.out.println("Invalid input");
        }
    }

    public static void showTransactionHistory(String fuel, int litre, int amount){
        fuelHistory[transactionCount] = fuel;
        litreHistory[transactionCount] = litre;
        amountHistory[transactionCount] = amount;
        historyDate[transactionCount] = LocalDate.now().toString();
        transactionCount++;

        System.out.println("Saving transaction history...");

        if (transactionCount == 0){
            System.out.println("No transactions found");
            return;
        }

        Systemout.println("\n Customer's Transaction Receipt");
        for (int count = 0; count < transactionCount; count++){
            System.out.println("===========================================");
            System.out.println("Product: " + fuelHistory[count]);
            System.out.println("Amount: " + amountHistory[count]);
            System.out.println("Litres: " + litreHistory[count]);
            System.outprintln("Date: " + historyDate[count]);
            System.out.println("===========================================");
        }
    }
}
