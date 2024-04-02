package miu.fpp.classworks.lesson12Exception.customExceptionExample;

import java.util.logging.Logger;

public class Rational {
    private static final Logger LOG = Logger.getLogger(Rational.class.getPackageName());
    public Rational(int num, int denom) throws NonPositiveDenomException {
        if (denom <= 0) {
            LOG.warning("Rational: Client attempted to enter a nonpositive denominator");
            throw new NonPositiveDenomException("Denominator must be positive.");
        }
    }

    public Rational add(Rational rational) {

        return rational;
    }
}
