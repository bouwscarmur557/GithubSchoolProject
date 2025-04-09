import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of students in your class: ");
        int students = scanner.nextInt();
        
        if (students <= 5) {
            System.out.println("Your class looks good.");
        } else {
            System.out.println("Your class is okay.");
        }
    }
}
