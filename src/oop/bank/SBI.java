package oop.bank;

public class SBI extends Bank {

    @Override
    protected float getRateOfInterest(float amount) {
        return amount * 0.08f;
    }
}
