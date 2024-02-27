package epam.exception;

public class CustomClassTest {

    public static void main(String[] args) {
        CustomClass customClass = new CustomClass();

        try {
            customClass.test(3);
        } catch (MyCustomException ex) {
            System.err.println(ex);
        }
    }
}
