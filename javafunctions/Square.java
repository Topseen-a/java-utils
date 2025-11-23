import java.util.Scanner;
    public class Square{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long checkSquare = Kata.squareOf(number);
        System.out.println("Square is " + checkSquare);


        }



    }
