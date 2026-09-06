import java.util.Scanner;

public class Input {

    public static void studentMarks() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");

        int maths = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        int hindi = sc.nextInt();
        int marathi = sc.nextInt();

        int totalMarks = maths + science + english + hindi + marathi;

        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {

        studentMarks();

    }
}