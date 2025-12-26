public class ArrayKata{
    public static void main(String[] args){

    int[] array = {1,3,7,4};
    System.out.println(minimumIn(array));
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
}
