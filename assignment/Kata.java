public class Kata{
    public static void main(String[] args){

    System.out.println(getDivision(24, 12));
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
}
