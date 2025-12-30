import java.util.Scanner;
public class MiniParkingSystem{
    public static void main(String[] args){

    int[] parkingSlot = new int [20];
    Scanner input = new Scanner(System.in);
    
        while(true){
            System.out.println("Welcome to Mini Parking System. ");
            System.out.println();
            System.out.println("1. Choose a slot to park your car ");
            System.out.println("2. Remove your car from the slot ");
            System.out.println("3. Display parking status ");
            System.out.println("0. Exit the app ");
            
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            if (choice == 0){
                System.out.println("Exiting app... ");
                break;    
            }

            switch (choice){
                case 1:
                    System.out.print("Enter a slot to park from (1-20): ");
                    int slotChoice = input.nextInt();

                    if (slotChoice < 1 || slotChoice > 20){
                        System.out.println("Invalid choice ");
                    }
                    else if (parkingSlot[slotChoice - 1] == 1){
                        System.out.println("Slot already occupied ");
                    }
                    else {
                        parkingSlot[slotChoice - 1] = 1;
                        System.out.println("Your car is parked at slot " + slotChoice);
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter the slot number to remove your car: ");
                    int removeSlotNumber = input.nextInt();

                    if (removeSlotNumber < 1 || removeSlotNumber > 20){
                        System.out.println("Invalid choice ");
                    }
                    else if (parkingSlot[removeSlotNumber - 1] == 0){
                        System.out.println("Slot already empty ");
                    }
                    else {
                        parkingSlot[removeSlotNumber - 1] = 0;
                        System.out.println("Your car is removed from slot " + removeSlotNumber);
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.println();
                    System.out.println("Parking status: ");
                    for (int count = 0; count < parkingSlot.length; count++){
                        String status = "";
                        if (parkingSlot[count] == 0){
                            status = "Empty";                
                        }
                        else {
                            status = "Occupied";
                        }
                        System.out.println("Slot " + (count + 1) + ": " + status);   
                    }
                    System.out.println();
                    break;                  
    
                default:
                    System.out.println("Invalid choice, choose an option from the listed option ");
                    System.out.println();
            }
        }
    }
}
