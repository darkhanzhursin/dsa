package patterns.behavioral.command.commands;

import patterns.behavioral.command.components.Light;

public record SwitchLightsCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.switchLights();
    }
}
