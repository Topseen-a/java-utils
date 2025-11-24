import java.util.Scanner;
    public class Subtraction{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();

        System.out.print("Enter a number: ");
        int numberTwo = input.nextInt();

        int checkSubtraction = Kata.subtractionOf(numberOne, numberTwo);
        System.out.println(checkSubtraction);

        }






    }
