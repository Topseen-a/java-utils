public class PepperFunction{
    public static void main(String[] args){

    int[] array = {12,2,4,56,7};
    int number = 12;
//    int result = isLargest(array);
//    System.out.println("The largest is " + result);
//    System.out.println(checkElement(array, number));
//    int result = getTotal(array);
//    System.out.println("The result is " + result);
//    System.out.println(takeNumber(2342));
    }

public static int isLargest(int[] array){
    int largest = array[0];

    for (int count = 1; count < array.length; count ++){
        if (array[count] > largest){
            largest = array[count];
            }        
        }
    return largest;
    }

//public static int getReverse(int[] number){
//    int[] newArray = new int[5];
//
//    for (int count =1; count < number.length; count--){
//        newArray += number;
//
//
//        }
//
//    return newArray;
//    }

public static boolean checkElement(int[] array, int number){
    for (int count = 0; count < array.length; count++){    
        if (number == array[count])
            return true;
        }
            return false; 
    }

public static int getTotal(int[] array){
    int sum = 0;

    for (int count = 0; count < array.length; count++){
        sum += array[count];   
        }
    return sum;
    }

//public static int isOddPosition(int[] number){
//    int[] odd = new int[size];
//
//    for (int count = 1; count < number.length; count++){
//        if (number.length % 2 != 0){
//            return count
//            }
//        }
//    return odd;
//    }

//public static int[] takeNumber(int number){
//
//    number = 0;
//    int[] newArray = new int[size];
//
//    for (int count = 1; count < number.length; count++){
//        number.length % 10;
//        }
//    return number;
//    }


}













