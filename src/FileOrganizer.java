
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FileOrganizer {

    public static List<File> detectFiles(String directoryPath) {
        File dir = new File(directoryPath);
        List<File> fileList = new ArrayList<>();

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("❌ Invalid directory: " + directoryPath);
            return fileList;
        }

        File[] files = dir.listFiles(File::isFile);
        if (files != null) {
            fileList.addAll(Arrays.asList(files));
        }

        return fileList;
    }

    public static String getFileType(File file) {
        String name = file.getName();
        int dotIndex = name.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == name.length() - 1) {
            return "Unknown";
        }

        String ext = name.substring(dotIndex).toLowerCase();
        return CategorizeFiles.typeMap.getOrDefault(ext, "Misc");
    }

    public static boolean moveFile(File file, String targetDirPath) {
        File targetDir = new File(targetDirPath);
        if (!targetDir.exists()) {
            boolean created = targetDir.mkdir();
            if (!created) {
                System.out.println("⚠️ Could not create folder: " + targetDirPath);
                return false;
            }
        }

        Path targetPath = targetDir.toPath().resolve(file.getName());

        try {
            Files.move(file.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            System.out.println("❌ Move failed: " + file.getName() + " → " + targetPath);
            return false;
        }
    }
    public static void logSummary(String fileName, String targetPath, boolean success) {
        String status = success ? "Success" : "Failed";
        String timestamp = LocalDateTime.now().toString();

        String logEntry = String.format("%s | %s → %s | %s\n",
                timestamp, fileName, targetPath, status);

        try (FileWriter writer = new FileWriter("organizer-summary.txt", true)) {
            writer.write(logEntry);
        } catch (IOException e) {
            System.out.println("⚠️ Error writing to summary report: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        // Example usage (you can replace this path with any local directory)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String str = input.next();

        detectFiles(str);
        // implement file organizer
        DetectFiles.detectFiles(str);
        CategorizeFiles.categorizeFiles(str);
        MoveFiles.categorizeAndMoveFiles(str);
    }
}