package patterns.behavioral.visitor;

import patterns.behavioral.visitor.models.Bank;
import patterns.behavioral.visitor.models.Company;
import patterns.behavioral.visitor.models.Resident;
import patterns.behavioral.visitor.models.Restaurant;

public interface Visitor {

    void visit(Bank bank);
    void visit(Company company);
    void visit(Resident resident);
    void visit(Restaurant restaurant);
}
