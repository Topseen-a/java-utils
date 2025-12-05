import java.util.Arrays;
public class StandardDeviation{
    public static void main(String[] args){

    int[] array = {1,2,3,4,5};
    System.out.println("The sum is: " + getSum(array));
    System.out.println("The length is: " + lengthOfArray(array));
    System.out.println("The mean is: " + getMean(array));
    System.out.println(Arrays.toString(getDeviation(array)));
//    System.out.println(Arrays.toString(getSquareDeviation(array)));
    }

public static int getSum(int[] array){

    int sum = 0;
    for (int count = 0; count < array.length; count++){
        sum += array[count];
        }
    return sum;
    }

public static int lengthOfArray(int[] array){

    int length = 0;
    for (int count = 0; count < array.length; count++){
        length = array[count];
        }
    return length;
    }

public static int getMean(int [] array){

    int mean = getSum(array) / lengthOfArray(array);
    return mean;
    }

public static double[] getDeviation(int[] array){

    double deviation = 0;
    double[] newArray = new double[array.length];

    for (int count = 0; count < array.length; count++){
        deviation = array[count] - getMean(array);
        newArray[count] = deviation;
    }
    return newArray;
    }

//public static double[] getSquareDeviation(double[] array){
//
//    double[] squareDeviation = new double[array.length];
//    double[] newArray = getDeviation(array);
//
//    for (int count = 0; count < array.length; count++){
//        squareDeviation = getDeviation[count] * getDeviation[count];
//        }
//    return squareDeviation;
//    }

}






















