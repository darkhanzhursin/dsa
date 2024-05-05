package patterns.behavioral.memento;

/*
- lets you save and restore the state of an object without revealing the details of its implementation
- to do that, this pattern makes full copies of an object's state
- delegates the creation of the object's state snapshot to the object itself
- makes the original object's data safe and secure
* */
public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Like and");
        editor.printText();
        editor.write("Like and Subscribe");
        editor.printText();
        editor.write("Like and Subscribe to Geekific!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
    }
}
