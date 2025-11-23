import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("ENter a number");
    int number = input.nextInt();

        boolean checkPrime = Kata.isPrime(number);
        if (checkPrime) {
            System.out.println("True");
            } else {
                System.out.println("False");
            }   
    }
}
