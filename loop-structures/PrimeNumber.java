import java.util.Scanner;
    public class PrimeNumber{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number % 2 != 0) {
            System.out.println(number + " is a prime number");
            }
        else{
            System.out.println(number + " is not a prime number");
            }

        }


}
