package oop.bank;

public class AXIS extends Bank {

    @Override
    protected float getRateOfInterest(float amount) {
        return amount * 0.07f;
    }
}
