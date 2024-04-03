package miu.mpp.lab1;

public class StaffStudent extends Person {
    private Student student;
    private Staff staff;
    public StaffStudent(String name, String phone, int age, double gpa, double salary) {
        super(name, phone, age);
        super.setSalary(salary);
        this.student = new Student(name, phone, age, gpa);
        this.staff = new Staff(name, phone, age, salary);
    }
    public void setGpa(double gpa) {
        student.setGpa(gpa);
    }
    public double getGpa() {
        return student.getGpa();
    }

    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    public double getSalary() {
        return super.getSalary();
    }

    public void addCourse(Course course) {
        student.addCourse(course);
    }

    public Student getStudent() {
        return student;
    }

    public Staff getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        return "StaffStudent";
    }
}
