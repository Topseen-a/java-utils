import java.util.Scanner;
    public class CountOfValues{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int postive = 0;
        int negative = 0;
        int zeros = 0;
    
        while(true){
            System.out.print("Enter a number or -1 to stop: ");
            int number = input.nextInt();

        if (number == -1){
            break;
            }

        if (number > 0){
            positiveCount++;
            }
        else if (number < 0){
            neagativeCount++;
            }
        else {
            zeroCount++;
            }
        }
        System.out.println("Positive numbers are: " + positveCount++);
        System.out.println("Negative numbers are: " + neativeCount++);
        System.out.println("Zeros: " + zeroCount++);

        }
    }

