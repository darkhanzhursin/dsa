package patterns.behavioral.visitor;

import patterns.behavioral.visitor.models.*;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("Sending mail about theft insurance to " + bank.getName());
    }

    @Override
    public void visit(Company company) {
        System.out.println("Sending employees and equipment insurance mail to " + company.getName());
    }

    @Override
    public void visit(Resident resident) {
        System.out.println("Sending mail about medical insurance to " + resident.getName());
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Sending mail about fire and food insurance to " + restaurant.getName());
    }
}
