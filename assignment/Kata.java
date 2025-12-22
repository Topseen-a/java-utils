public class Kata{
    public static void main(String[] args){

    System.out.println(getPositiveDifference(17, 12));
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
}
