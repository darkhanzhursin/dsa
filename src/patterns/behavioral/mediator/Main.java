package patterns.behavioral.mediator;

public class Main {

    /*
    - extracts all the relationships between your classes into a separate class
    - classes will be decoupled from one another
    - will communicate indirectly via the mediator
    - allows you to reuse any component in a different app
    - makes it easy to define new ways for these components to communicate by introducing new mediator classes
    * */

    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.enterUsername("user");
        dialog.enterPassword("password");

        dialog.simulateLoginClicked();
        dialog.simulateForgotPassClicked();
    }
}
