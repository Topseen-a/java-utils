import java.util.Scanner;

public class CreditCardValidator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your card details: ");
        String cardNumber = input.nextLine();

        
    }

public static boolean isValidCard(String cardNumber){
    int sum = 0;
    
    for (int index = cardNumber.length() - 1; index >= 0; index--){
        
    }
}

public static String cardType(String cardNumber){
    String cardType;

    if (cardNumber.startsWith("4")){
        return "Visa Card";
    }
    else if (cardNumber.startsWith("5")){
        return "Master Card";
    }
    else if (cardNumber.startsWith("37")){
        return "American Express Card";
    }
    else if(cardNumber.startsWith("6")){
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
