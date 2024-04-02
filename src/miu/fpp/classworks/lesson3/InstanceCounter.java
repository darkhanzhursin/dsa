package miu.fpp.classworks.lesson3;

public class InstanceCounter {

    private static int count;

    public InstanceCounter() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        InstanceCounter instance = null;
        for (int i = 0; i < 10; i++) {
            instance = new InstanceCounter();
        }
        System.out.println(instance.getCount());
    }
}
