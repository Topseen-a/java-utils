public class PerfectSquare{
    public static void main(String[] args){

    int[] array = {2,4,3,8};
    System.out.println(isPerfectSquare(array));
    }

    public static boolean isPerfectSquare(int[] array){
        for (int count = 0; count < array.length; count++){
            int number = array[count];
            for (int index = 1; index <= number; index++){
                if (index * index == number){
                    return true;
                }
            }
        }
        return false;
    }
}
