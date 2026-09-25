import java.util.Scanner;

public class Activity12m {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);

        char Semester, Project;
        double Semester_Test, Project_Test;

        System.out.print("Did you pass the semester test? <Y>es or <N>o: ");
        Semester = kd.next().charAt(0);

        System.out.print("Enter your semester percentage marks: ");
        Semester_Test = kd.nextDouble();

        System.out.print("Did you pass the practical project? <Y>es or <N>o: ");
        Project = kd.next().charAt(0);

        System.out.print("Enter your practical project percentage marks: ");
        Project_Test = kd.nextDouble();

        if ((Semester == 'Y' && Project == 'Y') && 
            (Semester_Test >= 80 || Project_Test >= 80)) {
            System.out.println("Dear Student, you are promoted to next grade without having to write the examination paper.");
        } else {
            System.out.println("Dear Student, you can't be promoted to next grade.");
        }

        kd.close();
    }
}
