package fpp.homeworks.lesson5.prob5;

public class Computer {

    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (ramSize != computer.ramSize) return false;
        if (Double.compare(processorSpeed, computer.processorSpeed) != 0) return false;
        if (!manufacturer.equals(computer.manufacturer)) return false;
        return processor.equals(computer.processor);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = manufacturer.hashCode();
        result = 31 * result + processor.hashCode();
        result = 31 * result + ramSize;
        temp = Double.doubleToLongBits(processorSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", processorSpeed=" + processorSpeed +
                '}';
    }
}
