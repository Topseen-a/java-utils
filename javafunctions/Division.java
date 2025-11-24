import java.util.Scanner;
    public class Division{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float numberOne = input.nextFloat();

        System.out.print("Enter a number: ");
        float numberTwo = input.nextFloat();

        float checkDivision = Kata.divisionOf(numberOne, numberTwo);
        System.out.println(checkDivision);
        }






    }
