package miu.fpp.homeworks.lesson3.problem1;

public class Main {
    private static final String city  = "Chicago";
    static Customer alice = new Customer("Alice", "Wick", "111");
    static Customer bob = new Customer("Bob", "Lee", "222");
    static Customer john = new Customer("John", "Solo", "333");

    public static void main(String[] args) {
        Address alicesAddress = new Address("1st N. Street", "Fairfield", "Iowa", "545277");
        Address bobsAddress = new Address("2nd S. Street", "Chicago", "Iowa", "545277");
        Address johnsAddress = new Address("3rd W. Street", "Chicago", "Iowa", "545277");
        alice.setBillingAddress(alicesAddress);
        alice.setShippingAddress(alicesAddress);
        bob.setBillingAddress(bobsAddress);
        bob.setShippingAddress(bobsAddress);
        john.setBillingAddress(johnsAddress);
        john.setShippingAddress(johnsAddress);

        Customer[] customers = new Customer[3];
        customers[0] = alice;
        customers[1] = bob;
        customers[2] = john;

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals(city)) {
                System.out.println(customer);
            }
        }
    }
}
