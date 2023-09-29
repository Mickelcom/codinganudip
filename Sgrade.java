/*Write a Java switch case program to take the students names and marks of 10 students as input and display their grades according to the below conditions:
 * If marks above 90 then “A” grade
 * If marks between 90-80 then “B” grade
 * If marks between 80-70 then “C” grade
 * If marks between 70-60 then “D” grade
 * If marks between 45-60 then “E” grade 
 * Else “F” */

import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter name of student " + i + "= ");
            String studentName = scanner.nextLine();

            System.out.print("Enter marks of student " + i + "= ");
            int studentMarks = scanner.nextInt();

            char grade;

            switch (studentMarks) {
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                    grade = 'A';
                    break;
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                    grade = 'B';
                    break;
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                    grade = 'C';
                    break;
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    grade = 'D';
                    break;
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    grade = 'E';
                    break;
                default:
                    grade = 'F';
            }

            System.out.println(studentName + "'s grade: " + grade);
        }
    }
}
