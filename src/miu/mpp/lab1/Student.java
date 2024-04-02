package miu.mpp.lab1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private double gpa;
    List<Course> courseList;

    public Student(String name, String phone, int age, double gpa) {
        super(name, phone, age);
        this.gpa = gpa;
        courseList = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public int getTotalUnits() {
        int sum = 0;
        if (!courseList.isEmpty()) {
            for (Course course : courseList) {
                sum += course.getUnits();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Student";
    }

}
