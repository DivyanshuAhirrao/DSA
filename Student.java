package arrayProg;

import sun.plugin.javascript.navig.Array;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);

        private String name;
        private int rollNo;
        private double percentage;

        public Student(String name, int rollNumber, double percentage) {
            this.name = name;
            this.rollNo = rollNumber;
            this.percentage = percentage;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            int n = scanner.nextInt();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            Student[] students = new Student[n];
            // Accept details for each student
            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for student " + (i+1) + ":");
                System.out.println("--------------xxxxxxxx---xxxxxxx---------------");
                System.out.print("Name: ");
                String name = scanner.next();

                System.out.print("Roll Number: ");
                int rollNumber = scanner.nextInt();

                System.out.print("Percentage: ");
                double percentage = scanner.nextDouble();

                students[i] = new Student(name, rollNumber, percentage);
            }
            // Sort the array of students based on percentage
            sortStudents(students);
            // Print the sorted array of students
            System.out.println("Details of students according to Highest Percentage:");
            System.out.println("====================================================");

            for (Student student : students) {
                System.out.println(student);
                System.out.println("------xxxxx------xxxxx-----xxxxx-------");

            }
        }

        public static void sortStudents(Student[] students) {
            Arrays.sort(students, (stud1, stud2) -> Double.compare(stud2.percentage, stud1.percentage));
        }

        @Override
        public String toString() {

            return "\tName:" + name + "\t Roll Number: " + rollNo + " \t Percentage: " + percentage;

        }



    }










