package patterns.structural.bridge.implementations;

public abstract class Pizza {

    protected String sauce;
    protected String toppings;
    protected String crust;

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSauce() {
        return sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public String getCrust() {
        return crust;
    }

    public abstract void assemble();
    public abstract void qualityCheck();
}
