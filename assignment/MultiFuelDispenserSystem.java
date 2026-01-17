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

            System.out.println("Choose an option");
            choice = input.nextInt();

            switch (choice){
                case 1: 
            }
            
        }
    }

    public static void buyFuel(Scanner input){
        System.out.print("Choose an option: ");
        int fuelChoice = input.nextInt();
    }

}
