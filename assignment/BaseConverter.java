public class BaseConverter{
    public static void main(String[] args){

        System.out.println(toBaseTwo(20));
    }

    public static String toBaseTwo(int number){

        if (number < 0){
            number *= -1;
        }
        if (number == 0){
            return "0";
        }
        else {
            int division = 0;
            int multiplication = 0;
            int difference = 0;

            String store = "";
            int originalNumber = number;

            for (int count = 0; count < number; count++){
                division = originalNumber / 2;
                multiplication = division * 2;
                difference = originalNumber - multiplication;

                store += difference + "";

                if (division == 0){
                    break;
                }
                originalNumber = division;
            }

            String reverse = "";
            for (int index = store.length() - 1; index >= 0; index--){
                reverse += store.charAt(index);
            }
            return reverse;
        }
    }
}
