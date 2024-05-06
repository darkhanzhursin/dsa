package patterns.behavioral.state.state;

import patterns.behavioral.state.Phone;

public class OffState extends State {

    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOffOn() {
        return null;
    }
}
