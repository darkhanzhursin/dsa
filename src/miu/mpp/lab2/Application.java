package miu.mpp.lab2;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Company microsoft = new Company("Microsoft");

        Department sales = new Department("Corporate Sales", "Birmingham, AL, USA", microsoft);
        Department marketing = new Department("Marketing Center", "Atlanta, GA, USA", microsoft);

        // Position topExecutive = new Position("CEO", "Top Executive")
        // Sales
        Position sm = new Position("Sales Manager", "Good at sales", sales);
        Position mba = new Position("MBA Manager", "Good at operates", sales);
        Position acc = new Position("Accountant", "Good at taxes", sales);
        Position head = new Position("Head", "Head of Department", sales);

        List<Position> salesPositions = List.of(sm, mba, acc, head);
        salesPositions.forEach(p -> sales.addPosition(p));

        // Marketing
        Position dev = new Position("Senior C++ developer", "Should have 10+ year experience", marketing);
        Position hr = new Position("HR", "Find talented devs", marketing);
        Position pm = new Position("PM", "Create new product", marketing);

        List<Position> marketingPositions = List.of(dev, hr, pm);
        marketingPositions.forEach(p -> marketing.addPosition(p));

        // Employees
        Employee johnBoole = new Employee(1, "John", "K.", "Boole",
                "02-22-1990", "2341-45-9188", 100000.0, sm);
        Employee chrisTailor = new Employee(2, "Chris", "L.", "Tailor",
                "03-10-2000", "2341-45-9288", 75000.0, mba);
        Employee markBrown = new Employee(3, "Mark", "D.", "Brown",
                "12-09-1993", "2341-45-9388", 86000.0, dev);
        Employee criRo = new Employee(4, "Christiano", "J.", "Ronaldo",
                "12-09-1986", "2341-45-9488", 186000.0, pm);
        Employee topExecutive = new Employee(5, "Lyle", "I", "Green",
                "22-08-1980", "2341-45-9938", 286000.0, head);

        sm.setEmployee(johnBoole);
        mba.setEmployee(chrisTailor);
        dev.setEmployee(markBrown);
        pm.setEmployee(criRo);


        microsoft.addDepartment(sales);
        microsoft.addDepartment(marketing);

        microsoft.print();
        microsoft.getSalary();
        microsoft.printReportingHierarchy();
        microsoft.getTopExecutive();
    }
}
