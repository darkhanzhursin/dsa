package patterns.behavioral.templateMethod;

public abstract class BaseGameLoader {
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTemplate();
        initializeProfiles();
    }

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void downloadAdditionalFiles();
    abstract void initializeProfiles();
    protected void cleanTemplate() {
        System.out.println("Cleaning temporary files...");
        // Some common code...
    };
}
