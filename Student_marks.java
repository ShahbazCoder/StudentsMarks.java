package JAVA.Programms.Assignment2;

import java.util.Scanner;

class Student {
    String Name;
    double[] marks = new double[5];

    // Constructor initialize
    public Student(String n, double[] arr) {
        Name = n;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = arr[i];
        }
    }

    // Average Marks
    public double average() {
        double total = 0.0, avg;
        for (double d : marks) {
            total += d;
        }
        avg = total / marks.length;

        return avg;
    }

    // Grade Calculator
    public String grade() {
        double avg = average();
        if (avg >= 90 && avg <= 100) {
            return "O";
        } else if (avg >= 80 && avg <= 89) {
            return "E";
        } else if (avg >= 70 && avg <= 79) {
            return "A";
        } else if (avg >= 60 && avg <= 69) {
            return "B";
        } else if (avg >= 50 && avg <= 59) {
            return "C";
        } else if (avg >= 40 && avg <= 49) {
            return "D";
        }
        return "FAIL";
    }

    // To String Method
    public String toString() {
        return "Name: \t\t" + Name + "\nMarks: \t\t" + marks[0] + "\t" + marks[1] + "\t" + marks[2] + "\t" + marks[3]
                + "\t"
                + marks[4] + "\nAverage: \t" + average() + "\nGrade: \t\t" + grade();
    }
}

class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n;
        double[] arr = new double[5];

        System.out.print("Enter Student Name : ");
        n = sc.nextLine();

        System.out.print("Enter marks of 5 Subjects = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("\n\n---- Student Details ----\n");
        Student St = new Student(n, arr);
        System.out.println(St);
    }
}