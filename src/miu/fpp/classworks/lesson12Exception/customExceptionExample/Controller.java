package miu.fpp.classworks.lesson12Exception.customExceptionExample;

import java.util.logging.Logger;

public class Controller {
    private static final Logger LOG = Logger.getLogger(Controller.class.getPackageName());

    public void performAddition(int x, int y, int z, int u) {
        try {
            Rational rational1 = new Rational(x, y);
            Rational rational2 = new Rational(z, u);
            Rational sum = rational1.add(rational2);
            System.out.println(sum.toString());
        } catch (NonPositiveDenomException e) {
            LOG.warning("Controller: Attempted to use a nonpositive denominator.");
            e.getMessage();
        }
    }
}
