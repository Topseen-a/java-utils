import java.util.Scanner;
    public class PrimeNumber{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int positiveNumber = input.nextInt();
        int flag = 0;

    if (positiveNumber <= 1){
        System.out.print("This number is not a prime number");
            }
    else {
        for (int count = 2; count <= positiveNumber - 1; count++){
            if (positiveNumber % count == 0){
                flag = 1; 
                    break;            
                    }
                }
            }
    if(flag == 0) {
        System.out.println(positiveNumber + " is a prime number");    
    } else {
        System.out.println(positiveNumber + " is not a prime number");    
    }



        }


}
