package miu.mpp.lab1;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {

    private double salary;
    List<Course> courseList;
    public Faculty(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Faculty";
    }
}
