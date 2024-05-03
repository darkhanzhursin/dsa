package patterns.behavioral.chainOfResponsibility;

import patterns.behavioral.chainOfResponsibility.handlers.Handler;
import patterns.behavioral.chainOfResponsibility.handlers.RoleCheckHandler;
import patterns.behavioral.chainOfResponsibility.handlers.UserExistsHandler;
import patterns.behavioral.chainOfResponsibility.handlers.ValidPasswordHandler;

/*
- use this pattern when you encounter the need to execute several handlers in a particular order
- allows you to insert, remove or reorder handlers dynamically
- each handler must male either process the request or pass it along the chain
- the client may trigger any handler in the chain not just the first one
* */
public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username", "user_password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username", "admin_password"));

        System.out.println("==========================================");
    }

}
