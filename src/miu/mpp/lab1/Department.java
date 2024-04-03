package miu.mpp.lab1;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    List<Person> personList;

    public Department(String name) {
        personList = new ArrayList<>();
        this.name = name;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
//        for (Person person : personList) {
//            if (person instanceof Staff) {
//                totalSalary += person.getSalary();
//            } else if (person instanceof Faculty) {
//                totalSalary += person.getSalary();
//            }
//        }
        for (Person person : personList) {
            totalSalary += person.getSalary();
        }
        return totalSalary;
    }

    public void showAllMembers() {
        System.out.println("All Members in the Department:");
        System.out.printf("%-20s %-15s %-5s %s\n", "Name", "Phone Number", "Age", "Type");
        for (Person person : personList) {
            System.out.printf("%-20s %-15s %-5d %s\n", person.getName(), person.getPhone(), person.getAge(), person);
        }
    }

    public void unitsPerFacultyUsingInstanceOf() {
        System.out.println("Units per Faculty:");
        for (Person person : personList) {
            if (person instanceof Faculty) {
                Faculty faculty = (Faculty) person;
                System.out.println(faculty.getName() + ": " + faculty.getTotalUnits() + " units");
            }
        }
    }

    public void unitsPerFacultyUsingSimpleName() {
        System.out.println("Units per Faculty:");
        for (Person person : personList) {
            if (person.getClass().getSimpleName().equals("Faculty")) {
                Faculty faculty = (Faculty) person;
                System.out.println(faculty.getName() + ": " + faculty.getTotalUnits() + " units");
            }
        }
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

}
