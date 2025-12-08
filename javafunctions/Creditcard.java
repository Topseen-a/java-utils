import java.util.Scanner;

public class Creditcard{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your card details: ");
        String cardNumber = input.nextLine();
    }

public static boolean cardNumberLength(String cardNumber){
    return cardNumber.length() >= 13 && cardNumber.length() <= 16;
}

public static String cardType(String cardNumber){
    String cardType;

    if (cardNumber.charAt(0) == "4"){
        return "Visa Card";
    }
    else if (cardNumber.charAt(0) == "5"){
        return "Master Card"
    }
    else if (cardNumber.charAt(0) == "3" && cardNumber.charAt(1) == "7"){
        return "American Express Card";
    }
    else if(cardNumber.charAt(0) == "6"){
        return "Discover Card";
    }
    else{
        return "Unknown Card Type";
    }
}

//public static int doubleSecondNumber(String cardNumber){
//    int sum = 0;
//
//    for (int count = 1; count < cardNumber.length(); count += 2){
//        int number = cardNumber
//
//
//    }
//
//
//
//
//
//
//}
//







}
