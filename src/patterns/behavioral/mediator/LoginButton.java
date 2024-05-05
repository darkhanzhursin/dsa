package patterns.behavioral.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginButton extends JButton implements Component {

    private Mediator mediator;

    public LoginButton() {
        super("Log in");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.login();
    }

    @Override
    public String getName() {
        return "LoginButton";
    }
}
