package oop.mid2.t2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a student with a name and a list of learning courses.
 */
public class Student {
    private String name;
    private List<LearningCourse> learningCourses;

    public Student(String name) {
        this.name = name;
        this.learningCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<LearningCourse> getLearningCourses() {
        return learningCourses;
    }

    public void addCourse(LearningCourse course) {
        this.learningCourses.add(course);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
