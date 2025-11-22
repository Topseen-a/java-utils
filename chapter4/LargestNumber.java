import java.util.Scanner;
    public class LargestNumber{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number = 0;
        int largest = number;

        for (int count = 1; count <= 10; count++){

            System.out.print("Enter an integer: ");
            number = input.nextInt();

            if (number > largest) largest = number;

            }

            System.out.println("The largest number is: " + largest);












        }


















    }
