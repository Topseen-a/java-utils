import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.print("How many student do you have? ");
        int studentNumber = input.nextInt();

        System.out.print("How many subjects do they offer? ");
        int subjectNumber = input.nextInt();

        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>");
        System.out.println("Saved succesfully");

        int[][] scores = new int[studentNumber][subjectNumber];
        int[] total = new int[studentNumber];
        int[] average = new int[studentNumber];
        int[] position = new int[studentNumber];

        int[] passedSubjects = new int[subjectNumber];
        int[] failedSubject = new int[subjectNumber];

        int studentScores = 0;
        int averageScores = 0;

        int highestScore = scores[0][0];
        int highestStudent = 0;
        int highestSubject = 0;

        int lowestScore = scores[0][0];
        int lowestStudent = 0;
        int lowestSubject = 0;

        for (int student = 0; student < studentNumber; student++){
            System.out.println("\nEntering score for student " + (student + 1));
            int totalScores = 0;

            for (int subject = 0; subject < subjectNumber; subject++){
                System.out.print("Enter score for subject " + (subject + 1) + ": ");
                scores[student][subject] = input.nextInt();

                while(scores[student][subject] < 0 || scores[student][subject] > 100){
                    System.out.print("Invalid score, enter a score between 0 - 100: ");
                    scores[student][subject] = input.nextInt();
                }

                totalScores += scores[student][subject];

                if (scores[student][subject] > highestScore){
                    highestScore = scores[student][subject];
                    highestStudent = student;
                    highestSubject = subject;
                }
                if (scores[student][subject] < lowestScore){
                    lowestScore = scores[student][subject];
                    lowestStudent = student;
                    lowestSubject = subject; 
                }
            }
            
            total[student] = totalScores;
            average[student] = totalScores / subjectNumber;
            
            studentScores += totalScores;
            averageScores += average[student];
        }
    }

}
