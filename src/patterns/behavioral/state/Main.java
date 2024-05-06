package patterns.behavioral.state;

/*
- allows an object to alter its behavior when its internal state changes
- extract each logic to a separate class and let the context delegate the behavior to the corresponding state class
- applies the Single Responsibility and the Open-Closed Principles
- each state is now organized in a separate class, and we can easily introduce new states
* */
public class Main {

    public static void main(String[] args) {

        Phone phone = new Phone();
        simulatePhoneClicks(phone);

    }

    private static void simulatePhoneClicks(Phone phone) {
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
    }
}
