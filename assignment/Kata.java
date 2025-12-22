public class Kata{
    public static void main(String[] args){

    System.out.println(factorialOf(5));
}
    
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        } 
        else {
            return false;
        }
    }

    public static int getPositiveDifference(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber - secondNumber;
        }
        else {
            return secondNumber - firstNumber;
        }
    }

    public static float getDivision(int firstNumber, int secondNumber){
        if(secondNumber == 0){
            return 0;
        }
        else {
            return firstNumber / secondNumber;
        }
    }

    public static int factorOf(int number){
        int count = 0;
        for (int index = 1; index <= number; index++){
            if (number % index == 0){
                count ++;
            }      
        }
        return count;
    }

    public static int factorialOf(int number){
        int factorial = 1;
        for (int count = 1; count <= number; count++){
            factorial *= count;
        }
        return factorial;
    }
}
