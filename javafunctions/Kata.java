public class Kata {
    
    public static boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPrime(int number) {
        int flag = 0;
        if (number <= 1){
            return false;
        } else {
            for (int count = 2; count <= number -1; count++){
                if (number % count == 0){
                    flag = 1;
                break;
                }
            }
        }
        if(flag == 0) {
            return true;   
        } else {
            return false;
            }
        }

    public static boolean isPalindrome(int number) {
        int numberOne = number / 10000;
        int numberTwo = (number / 1000) % 10;
        int numberThree = (number / 100) % 10;
        int numberFour = (number /10) % 10;
        int numberFive = number % 10;

        if (numberOne == numberFive && numberTwo == numberFour){
            return true;
            } else {
                return false;
                }
    }

    public static long factorialOf(int number) {
        int factorial = 1;
        for (int count = 1; count <= number; count++){
            factorial = factorial * count;
            }
            return factorial;




    }






}
