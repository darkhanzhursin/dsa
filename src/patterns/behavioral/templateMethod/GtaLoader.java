package patterns.behavioral.templateMethod;

public class GtaLoader extends BaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading Gta files...");
        // Some Gta Code...
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Gta objects...");
        // Some Gta Code...
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading Gta sounds...");
        // Some Gta Code...
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading Gta profiles...");
        // Some Gta Code...
    }
}
