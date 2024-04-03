package miu.mpp.lab1;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {

    List<Course> courseList;
    public Faculty(String name, String phone, int age, double salary) {
        super(name, phone, age);
        super.setSalary(salary);
        courseList = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public int getTotalUnits() {
        return courseList.stream().mapToInt(Course::getUnits).sum();
    }

    public double getSalary() {
        return super.getSalary();
    }

    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public String toString() {
        return "Faculty";
    }
}
