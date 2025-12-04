public class LargestElement{
    public static void main(String[] args){

    int[] number = {12,2,4,56,7};
    int result = isLargest(number);
    System.out.println("The largest is " + result);
    }

public static int isLargest(int[] number){
    int largest = number[0];

    for (int count = 1; count < number.length; count ++){
        if (number[count] > largest){
            largest = number[count];
            }        
        }
    return largest;
    }
}
