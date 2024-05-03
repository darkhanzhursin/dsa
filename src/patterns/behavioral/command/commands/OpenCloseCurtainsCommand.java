package patterns.behavioral.command.commands;

import patterns.behavioral.command.components.Curtains;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {

    @Override
    public void execute() {
        curtains.openClose();
    }
}
