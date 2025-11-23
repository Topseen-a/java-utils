import java.util.Scanner;
    public class Palindrome{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit integer: ");
        int number = input.nextInt();

        boolean checkPalindrome = Kata.isPalindrome(number);
        if (checkPalindrome) {
            System.out.println("True");
            } else {
                System.out.println("False");
                }


        }


    }
