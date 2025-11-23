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

    
}
