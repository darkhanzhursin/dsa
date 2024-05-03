package patterns.behavioral.chainOfResponsibility.handlers;

import patterns.behavioral.chainOfResponsibility.Database;
import patterns.behavioral.chainOfResponsibility.handlers.Handler;

public class ValidPasswordHandler extends Handler {

    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Invalid password!");
            return false;
        }
        return handleNext(username, password);
    }
}
