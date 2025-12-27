public class ArrayKata{
    public static void main(String[] args){

    int[] array = {1,3,8,4};
    System.out.println(sumOfOddNumbersIn(array));
    }

    public static int maximumIn(int[] array){
        int maximum = array[0];
        for (int count = 1; count < array.length; count++){
            if (array[count] > maximum){
            maximum = array[count];
            }
        }
        return maximum;
    }

    public static int minimumIn(int[] array){
        int minimum = array[0];
        for (int count = 1; count < array.length; count++){
            if (array[count] < minimum){
                minimum = array[count];        
            }
        }
        return minimum;
    }

    public static int sumOf(int[] array){
        int sum = 0;
        for (int count = 0; count < array.length; count++){
            sum += array[count];
        }
        return sum;
    }

    public static int sumOfEvenNumbersIn(int[] array){
        int sum = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 == 0){
                sum += array[count];
            }
        }
        return sum;
    }

    public static int sumOfOddNumbersIn(int[] array){
        int sum = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 != 0){
                sum += array[count];
            }
        }
        return sum;
    }
}
