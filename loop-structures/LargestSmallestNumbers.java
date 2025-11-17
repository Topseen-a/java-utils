import java.util.Scanner;
    public class LargestSmallestNumbers{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int largest = number;
        int smallest = number;

        while(true){
            
            System.out.print("Enter the numbers you want: ");
            number = input.nextInt();

            if(number == -1) {
                break;
            }
            if(number > largest) {
            largest = number;
            }
            if (number < smallest) {
            smallest = number;
            }
        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
}
