public class BaseConverter{
    public static void main(String[] args){


    }

    public static int toBaseTwo(int number){

        if (number < 0){
            number *= -1;
        }
        else if (number == 0){
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
            }

        
        }
    }
}
