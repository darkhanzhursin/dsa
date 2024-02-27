package epam.exception;

public class CustomClass {

    public void test(int n) throws MyCustomException {
        if (n > 3) {
            System.out.println("Correct");
        } else {
            throw new MyCustomException("Number must me more than 3: " + n);
        }
    }

}
