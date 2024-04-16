package miu.mpp.lab2;

import java.util.List;

public class Application {
    static int counterId;
    public static void main(String[] args) throws CloneNotSupportedException {
        Company microsoft = new Company("Microsoft");

        Department salesDpt = new Department("Corporate Sales", "Birmingham, AL, USA", microsoft);
        Department otherSalesDpt = new Department("Corporate Sales", "Birmingham, AL, USA", microsoft);
        Department marketingDpt = new Department("Marketing Center", "Atlanta, GA, USA", microsoft);

        Position topExecutive = new Position(Position.TOP_EXECUTIVE, "Responsible for company's success.");
        Position sameTopExec = new Position(Position.TOP_EXECUTIVE, "Responsible for company's success.");
        Position otherTopExec = new Position(Position.TOP_EXECUTIVE, "Responsible for company's success.");
        // Sales
        Position sm = new Position("Sales Manager", "Good at sales", salesDpt);
        Position mba = new Position("MBA Manager", "Good at operates", salesDpt);
        Position acc = new Position("Accountant", "Good at taxes", salesDpt);
        Position salesRep = new Position("Sales Representative",
                "Sales representatives are sales reps that focus on generating sales for the company.", salesDpt);
        Position salesAssist = new Position("Sales Assistant",
                "Sales assistants are typically entry-level sales roles with the responsibility for doing clerical work in sales.",
                salesDpt);
        Position salesTrainee = new Position("Sales Trainee",
                "Sales Trainees are also sales reps in training who typically do clerical work.", salesDpt);
        Position salesEngineer = new Position("Sales Engineer",
                "Sales engineers work with customers to ensure they are satisfied with their sales transactions " +
                        "and provide any support they need.", salesDpt);
        Position salesAssociate = new Position("Sales Associate",
                "Sales associates are sales reps that handle smaller accounts and focus on generating sales " +
                        "for the company.", salesDpt);
        Position headOfSales = new Position(Position.HEAD, "Head of Sales Department", salesDpt);

        List<Position> salesPositions = List.of(sm, mba, acc, headOfSales);
        salesPositions.forEach(p -> salesDpt.addPosition(p));

        // Marketing
        Position dev = new Position("Senior C++ developer", "Should have 10+ year experience", marketingDpt);
        Position hr = new Position("HR", "Find talented devs", marketingDpt);
        Position pm = new Position("PM", "Create new product", marketingDpt);
        Position headOfMarketing = new Position(Position.HEAD, "Head of Marketing Department", marketingDpt);

        List<Position> marketingPositions = List.of(dev, hr, pm, headOfMarketing);
        marketingPositions.forEach(p -> marketingDpt.addPosition(p));

        // Inferiors
        List<Position> heads = List.of(headOfSales, headOfMarketing);
        subdue(heads, topExecutive); // Ron, Anne -> Lyle
        subdue(heads, sameTopExec);
        List<Position> marketingInferiors = List.of(dev, hr, pm);
        subdue(marketingInferiors, headOfMarketing); // Gary -> Anne
        List<Position> salesInferiors = List.of(sm, mba, acc);
        subdue(salesInferiors, headOfSales); // Peter, Stan -> Ron
        List<Position> mbaInferiors = List.of(salesAssist, salesTrainee, salesRep);
        subdue(mbaInferiors, mba); // Tom, Sue, Marc -> Stan
        List<Position> smInferiors = List.of(salesEngineer, salesAssociate);
        subdue(smInferiors, sm); // Bill, Dan -> Peter

        // Employees
        Employee tom = new Employee(getId(), "Tom", "S", "Carlos",
                "02-22-1990", "2341-45-9188", 100000.0, salesRep);
        Employee sue = new Employee(getId(), "Sue", "S", "Larry",
                "02-22-1990", "2341-45-9188", 100000.0, salesAssist);
        Employee marc = new Employee(getId(), "Marc", "B", "Kennedy",
                "02-22-1990", "2341-45-9188", 100000.0, salesTrainee);
        Employee bill = new Employee(getId(), "Bill", "T", "Tim",
                "02-22-1990", "2341-45-9188", 100000.0, salesEngineer);
        Employee dan = new Employee(getId(), "Dan", "R", "Clinton",
                "02-22-1990", "2341-45-9188", 100000.0, salesAssociate);
        Employee peter = new Employee(getId(), "Peter", "K.", "Boole",
                "02-22-1990", "2341-45-9188", 100000.0, sm);
        Employee stan = new Employee(getId(), "Stan", "L.", "Tailor",
                "03-10-2000", "2341-45-9288", 75000.0, mba);
        Employee ron = new Employee(getId(), "Ron", "D.", "Brown",
                "12-09-1993", "2341-45-9388", 86000.0, headOfSales);

        Employee gary = new Employee(getId(), "Gary", "J.", "Potter",
                "12-09-1986", "2341-45-9488", 186000.0, pm);
        Employee anne = new Employee(getId(), "Anne", "O", "Jackson",
                "12-09-1984", "2341-45-9485", 186000.0, headOfMarketing);

        Employee lyle = new Employee(getId(), "Lyle", "I", "Green",
                "22-08-1980", "2341-45-9938", 286000.0, topExecutive);
        Employee sameLyle = new Employee(getId(), "Lyle", "I", "Green",
                "22-08-1980", "2341-45-9938", 286000.0, topExecutive);
        Employee otherLyle = new Employee(getId(), "Lyle", "I", "Green",
                "22-08-1980", "2341-45-9939", 286000.0, topExecutive);

//        salesRep.setEmployee(tom);
//        salesAssist.setEmployee(sue);
//        salesTrainee.setEmployee(marc);
//        salesEngineer.setEmployee(bill);
//        salesAssociate.setEmployee(dan);
//        sm.setEmployee(peter);
//        mba.setEmployee(stan);
//        pm.setEmployee(gary);
//        headOfMarketing.setEmployee(anne);
//        headOfSales.setEmployee(ron);
//
//        topExecutive.setEmployee(lyle);
//
//        microsoft.addDepartment(salesDpt);
//        microsoft.addDepartment(marketingDpt);

        //microsoft.print();
//        microsoft.getSalary();
//        microsoft.printReportingHierarchy();
        System.out.println("Is Equal? " + lyle.equals(sameLyle));
        System.out.println("Is Equal? " + lyle.equals(otherLyle));
        System.out.println();
        System.out.println("Is Equal? " + topExecutive.equals(sameTopExec));
        boolean eq = topExecutive.hashCode() == sameTopExec.hashCode();
        System.out.println("Are hash codes equal? " + eq);
        System.out.println("Is Equal? " + topExecutive.equals(otherTopExec));
        System.out.println();
        System.out.println("Is Equal? " + salesDpt.equals(otherSalesDpt));
        // Position Cloning Test
        headOfSales.setEmployee(ron);
        Position clonedHeadSales = (Position) headOfSales.clone();
        System.out.println("headSales and clonedHeadSales == test: " + (clonedHeadSales == headOfSales));
        System.out.println("headSales superior: " + headOfSales.getSuperior());
        System.out.println("clonedHeadSales superior: " + clonedHeadSales.getSuperior());
        clonedHeadSales.setSuperior(headOfMarketing);
        System.out.println("headSales superior: " + headOfSales.getSuperior());
        System.out.println("clonedHeadSales superior: " + clonedHeadSales.getSuperior());
        clonedHeadSales.setEmployee(gary);
        System.out.println(headOfSales.getEmployee());
        System.out.println(clonedHeadSales.getEmployee());

        // Department Cloning Test
        Department clonedDept = (Department) salesDpt.clone();
        System.out.println(clonedDept != salesDpt);
        System.out.println(clonedDept.getCompany().equals(salesDpt.getCompany()));
        clonedDept.setCompany(new Company("Apple"));
        System.out.println(clonedDept.getCompany().equals(salesDpt.getCompany()));
        System.out.println(clonedDept.getPositions().equals(salesDpt.getPositions()));
        clonedDept.addPosition(new Position("test", "test"));
        System.out.println(clonedDept.getPositions().equals(salesDpt.getPositions()));
    }

    static void subdue(List<Position> positions, Position position) {
        positions.forEach(p -> position.addInferior(p));
        positions.forEach(p -> p.setSuperior(position));
    }

    static int getId() {
        return ++counterId;
    }
}
