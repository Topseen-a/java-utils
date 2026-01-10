import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.print("How many student do you have? ");
        int studentCount = input.nextInt();

        System.out.print("How many subjects do they offer? ");
        int subjectCount = input.nextInt();

        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>");
        System.out.println("Saved succesfully");

        int[][] studentScores = new int[studentCount][subjectCount];
        int[] totalScoresPerStudent = new int[studentCount];
        int[] averageScoresPerStudnt = new int[studentCount];
        int[] studentPositions = new int[studentCount];

//        int[] passedSubjects = new int[subjectNumber];
//        int[] failedSubject = new int[subjectNumber];

        int classTotalScores = 0;
        int classAverageScores = 0;

        int highestScoreOverall = studentScores[0][0];
        int highestScoreStudent = 0;
        int highestScoreSubject = 0;

        int lowestScoreOverall = studentScores[0][0];
        int lowestScoreStudent = 0;
        int lowestScoreSubject = 0;

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++){
            System.out.println("\nEntering score for student " + (studentIndex + 1));
            int studentTotalScore = 0;

            for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++){
                System.out.print("Enter score for subject " + (subjectIndex + 1) + ": ");
                studentScores[studentIndex][subjectIndex] = input.nextInt();

                while(studentScores[studentIndex][subjectIndex] < 0 || studentScores[studentIndex][subjectIndex] > 100){
                    System.out.print("Invalid score, enter a score between 0 - 100: ");
                    studentScores[studentIndex][subjectIndex] = input.nextInt();
                }

                studentTotalScore += studentScores[studentIndex][subjectIndex];

                if (studentScores[studentIndex][subjectIndex] > highestScoreOverall){
                    highestScoreOverall = studentScores[studentIndex][subjectIndex];
                    highestScoreStudent = studentIndex;
                    highestScoreSubject = subjectIndex;
                }
                if (studentScores[studentIndex][subjectIndex] < lowestScoreOverall){
                    lowestScoreStudent = studentScores[studentIndex][subjectIndex];
                    lowestScoreStudent = studentIndex;
                    highestScoreSubject = subjectIndex; 
                }
            }
            
            totalScoresPerStudent[studentIndex] = studentTotalScore;
            averageScoresPerStudnt[studentIndex] = studentTotalScore / subjectCount;
            
            classTotalScores += studentTotalScore;
            classAverageScores += averageScoresPerStudnt[studentIndex];
        }

//        for (int studentIndex = 0; student < )
    }

}
