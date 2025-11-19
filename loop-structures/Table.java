public class Table{
    public static void main(String[] args){

    System.out.println("a\t b\t pow(a, b)");

    
    for (int count = 1; count<= 5; count++){
        int b = count +1;
        int pow = (int)Math.pow(count, b);
    System.out.printf("%d\t%d\t%d%n", count, b, pow);
            }
        }
}
