import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for(int count = 1; count <= 5; count++){
            System.out.print("Enter student " + count + " name: ");
            String name = input.nextLine();

            System.out.print("Enter " + name + " letter grade (A,B,C,D): ");
            char grade = input.nextLine().toUpperCase().charAt(0);

            switch (grade){
                case 'A':
                    countA++;
                    break;
                
                case 'B':
                    countB++;
                    break;

                case 'C':
                    countC++;
                    break;
                case 'D':
                    countD++;
                    break;
                default:
                    System.out.println("Invalid grade entered ");
            }
            System.out.println();
        }
        System.out.println("Grade Result");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
    }
}
