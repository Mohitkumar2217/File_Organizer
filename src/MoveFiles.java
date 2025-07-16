import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class MoveFiles {
    public static void moveFileToCategory(File file, String targetDirPath) {
        // Create target directory if it doesn't exist
        File targetDir = new File(targetDirPath);
        if (!targetDir.exists()) {
            targetDir.mkdir();
        }

        Path targetPath = targetDir.toPath().resolve(file.getName());

        try {
            Files.move(file.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("✅ Moved: " + file.getName() + " → " + targetDir.getName());
        } catch (IOException e) {
            System.out.println("❌ Failed to move: " + file.getName() + " → " + targetDir.getName());
            e.printStackTrace();
        }
    }

    // Example usage—integrate with categorize logic
    public static void categorizeAndMoveFiles(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles(File::isFile);
        if (files == null) return;

        for (File file : files) {
            String category = CategorizeFiles.getFileType(file); // reuse your type logic here
            String targetDirPath = dir.getAbsolutePath() + File.separator + category;
            moveFileToCategory(file, targetDirPath);
        }
    }

}
