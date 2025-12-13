import java.util.Scanner;
    public class Palindrome{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit integer: ");
        int number = input.nextInt();
    while(true){
        if (number >= 10000 && number <= 99999){
            break;
            }
        else {
            System.out.println("Invalid input, enter a five digit integer: ");
            }
         }
            int numberOne = number / 10000;
            int numberTwo = (number / 1000) % 10;
            int numberThree = (number / 100) % 10;
            int numberFour = (number / 10) % 10;
            int numberFive = number % 10;

        if (numberOne == numberFive && numberTwo == numberFour){
            System.out.println("It is a palindrome");
            }
        else {
            System.out.println("It is not a palindrome");
            }
        }
    }
