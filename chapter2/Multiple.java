import java.util.Scanner;
    public class Multiple{
        public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer:");
        int numberOne = input.nextInt();

        System.out.print("Enter second integer:");
        int numberTwo = input.nextInt();

        int numberOneTrippled = numberOne * 3;
        int numberTwoDoubled = numberTwo * 2;

        if (numberOneTrippled % numberTwoDoubled == 0){
            System.out.println("It is a multiple");
        }
        else {
            System.out.println("It is not a multiple");
        }
        }
    }
