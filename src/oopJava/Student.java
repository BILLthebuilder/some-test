package oopJava;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private int[] studentId;
    private int[] score;
    public Student(int[] studentId, int[] score){
        this.studentId = studentId;
        this.score = score;
        System.out.println("Student ID's are:"+ Arrays.toString(studentId) + "Their scores are:"+ Arrays.toString(score));
    }
    Scanner scanner = new Scanner(System.in);

    public void createStudents() {
        studentId = new int[3];
        score = new int[3];
        for (int i = 0; i < studentId.length; i++) {
            System.out.println("Enter the student ID:");
            studentId[i] = scanner.nextInt();
        }
        System.out.println("Input student scores:");
        for (int i = 0; i < score.length; i++) {
            System.out.println("Okay, now enter the student scores:");
            score[i] = scanner.nextInt();
        }
        System.out.println("Student ID's and their scores are:"+ Arrays.toString(studentId) + Arrays.toString(score));
    }
}
