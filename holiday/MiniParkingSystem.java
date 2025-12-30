import java.util.Scanner;
public class MiniParkingSystem{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
        while(true){
            System.out.println("Welcome to Mini Parking System. ");
            System.out.println();
            System.out.println("1. Choose a slot to park your car ");
            System.out.println("2. Remove your car from the slot ");
            System.out.println("0. Exit the app ");
            
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            if (choice == 0){
                System.out.println("Exiting app... ");
                break;    
            }

            switch (choice){
                case 1:
                    System.out.print("Enter a slot from (1-20): ");
                    int slotChoice = input.nextInt();
                    break;
                case 2:
                    System.out.print("Enter the slot number to remove your car: ");
                    int removeSlotNumber = input.nextInt();
                    break;
                default:
                    System.out.println("Invalid choice, choose an option from the listed option ");
                    System.out.println();
            }
        }
    }


}
