package patterns.behavioral.command.components;

public class Light {

    private boolean switchedOn = false;

    public void switchLights() {
        switchedOn = !switchedOn;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }
}
