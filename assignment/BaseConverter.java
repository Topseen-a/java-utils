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
            String store = "";

            while (number > 0){
                int remainder = number % 2;
                store += remainder;
                number /= 2;

            }

            String reverse = "";
            for (int index = store.length() - 1; index >= 0; index--){
                reverse += store.charAt(index);
            }
            return reverse;
        }
    }
}
