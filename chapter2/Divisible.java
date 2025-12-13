import java.util.Scanner;
    public class Divisible{
        public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer:");
        int numberOne = input.nextInt();

        if (numberOne % 3 == 0){
            System.out.println("It is divisible by three");        
            }
        else {
            System.out.println("It is not divisible by three");
            }
        }
    }
