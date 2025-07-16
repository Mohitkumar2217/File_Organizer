import java.io.File;
public class DetectFiles {
    // Phase 1: File Detection
    public static void detectFiles(String directoryPath) {
        File dir = new File(directoryPath);

        // Check if the path is valid
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path: " + directoryPath);
            return;
        }

        // List contents
        File[] items = dir.listFiles();
        if (items == null || items.length == 0) {
            System.out.println("The directory is empty.");
            return;
        }

        // Separate files and folders
        System.out.println("📁 Folders:");
        for (File item : items) {
            if (item.isDirectory()) {
                System.out.println(" - " + item.getName());
            }
        }

        System.out.println("\n📄 Files:");
        for (File item : items) {
            if (item.isFile()) {
                System.out.println(" - " + item.getName());
            }
        }
    }
}
