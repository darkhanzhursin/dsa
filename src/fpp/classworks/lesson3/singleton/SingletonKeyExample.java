package fpp.classworks.lesson3.singleton;

public class SingletonKeyExample {

    private static SingletonKeyExample singletonObject;
    String key;

    private SingletonKeyExample() {
        key = "H123456L123";
        this.getKey();
    }

    public static SingletonKeyExample getSingletonObject() {
        if (singletonObject != null) {
            System.out.println("Unsuccessful to produce the key...");
            return null;
        } else {
            System.out.println("Key generated successfully...");
            singletonObject = new SingletonKeyExample();
            return singletonObject;
        }
    }

    private void getKey() {
        System.out.println("Your key to activate Avast antivirus is: " + key);
    }
}
