import java.util.Scanner;
public class CheckOutApp{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.println("What is the customer's name? ");
        String customerName = input.nextLine();

        String[] items = new String[20];
        int[] quantityOfItems = new int[20];
        double[] prices = new double[20];

        int count = 0;
        double subTotal = 0;

        while(true){
            System.out.print("What did the user buy? ");
            items[count] = input.nextLine();

            System.out.print("How many pieces? ");
            quantityOfItems[count] = input.nextInt();

            System.out.print("How much per unit? ");
            prices[count] = input.nextDouble();

            subTotal += quantityOfItems[count] * prices[count];
            count++;

            System.out.print("Add more items? ");
//            input.nextLine();
            String choice = input.nextLine();
    
            if (choice.equalsIgnoreCase("no")){
                break;
            }
        }

        System.out.print("What is your name? ");
        String cashierName = input.nextLine();

        System.out.println("How much discount will he get? ");
        double discountInput = input.nextDouble();

        double discount = (discountInput / 100) * subTotal;
        double vat = 0.075 * (subTotal - discount);
        double totalBill = subTotal - discount + vat;

//        LocalDateTime now = LocalDateTime.now();
    
        System.out.println();
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date: " + LocalDateTime);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);

    }
}
