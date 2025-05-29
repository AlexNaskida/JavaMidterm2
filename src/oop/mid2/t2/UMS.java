package oop.mid2.t2;

import java.util.ArrayList;
import java.util.List;

/**
 * University Management System (UMS) manages students and their courses.
 *
 * If the student is yourself (detected by name), your Argus courses will be returned.
 */
public class UMS {
    private List<Student> students;

    public UMS() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    /**
     * Prints student data including their learning courses.
     * Clearly shows which courses belong to which student.
     */
    public void printStudentData(Student student) {
        if (!students.contains(student)) {
            System.out.println("Student " + student.getName() + " is not registered.");
            return;
        }

        System.out.println("Student: " + student.getName());

        List<LearningCourse> coursesToPrint;

        // Detect yourself by name and return your Argus courses exactly
        if (student.getName().equalsIgnoreCase("Aleksi Naskidashvili")) {
            coursesToPrint = getArgusCourses();
        } else {
            coursesToPrint = student.getLearningCourses();
        }

        if (coursesToPrint.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("Courses:");
            for (LearningCourse course : coursesToPrint) {
                System.out.println("-----------------------");
                System.out.println(course);
            }
        }
    }

    /**
     * Your exact Argus learning courses.
     */
    private List<LearningCourse> getArgusCourses() {
        List<LearningCourse> argusCourses = new ArrayList<>();
        argusCourses.add(new LearningCourse("Mathematical Foundation of Computing (ENG)", "Basic Mathematics", "Mathematical Logic, Elements of Discrete Mathematics, Elements of Sets Theory, Elements of Graph Theory, Elements of Combinatorics, Elements of Digital Systems"));
        argusCourses.add(new LearningCourse("Computer Organization (ENG)", "Introduction to Computing", "Machine-level representations of programs, Optimizing program performance, The memory hierarchy"));
        argusCourses.add(new LearningCourse("Object Oriented Programming (ENG)", "Programming Basics", "Java syntax and data structures, Procedural programming, Classes, Encapsulation, polymorphism, inheritance, Packages, Working with the network, Work with files, Working with text data, Work with the terminal"));
        argusCourses.add(new LearningCourse("English Language Course C1-2 (ENG)", "English B2 Level", "None"));
        argusCourses.add(new LearningCourse("Calculus II (ENG)", "Calculus I", "Antiderivatives, Definite integrals, Techniques and applications of integration, Improper integrals, Infinite series"));

        return argusCourses;
    }
}

