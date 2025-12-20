import java.util.Scanner;
public class Multiple{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    while (true){
        System.out.print("Enter the first number or -1 to exit: ");
        int firstNumber = input.nextInt();

        if (firstNumber == -1){
            break;
        }
        else {
            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();
        
            if (isMultiple(firstNumber,secondNumber)){
                System.out.println(secondNumber + "is a multiple of " + firstNumber);
            }
            else {
                System.out.println(secondNumber + "is not a multiple of " + firstNumber);
            }
        }
        
    }

    System.out.println(isMultiple(4,12));
}

    public static boolean isMultiple(int numberOne, int numberTwo){
        if (numberTwo % numberOne == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
