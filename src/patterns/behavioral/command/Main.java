package patterns.behavioral.command;

import patterns.behavioral.command.commands.OpenCloseCurtainsCommand;
import patterns.behavioral.command.commands.SwitchLightsCommand;
import patterns.behavioral.command.components.FloorLamp;
import patterns.behavioral.command.components.Room;

/*
- turns a specific method call a stand-alone object
- opens a lot of interesting uses: such as passing commands as method arguments, storing them inside other objects or
 even switching commands at runtime
 - commands can be serialized, making it easy to write it to and read it from a file
* */
public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());
    }
}
