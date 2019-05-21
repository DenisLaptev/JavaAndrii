package com.javaproject.firstproject.task9.students;

public class Application {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students = createStudents();

        System.out.println("------------------------------");
        System.out.println("all students:");
        printAllStudents(students);

        System.out.println("------------------------------");
        String faculty = "Physics";
        System.out.println("students of faculty: " + faculty);
        printStudentsOfFaculty(students, faculty);

    }

    public static Student[] createStudents() {
        Student[] students = new Student[5];
        students[0] = new Student("Ivanov", "Programming");
        students[1] = new Student("Petrov", "Mathematics");
        students[2] = new Student("Sidorov", "Physics");
        students[3] = new Student("Kuznecov", "English");
        students[4] = new Student("Einshtein", "Physics");

        return students;
    }

    public static void printAllStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public static void printStudentsOfFaculty(Student[] students, String faculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                System.out.println(students[i]);
            }
        }
    }
}
