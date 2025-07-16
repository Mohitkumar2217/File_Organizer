import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    // Define test folders you want to evaluate
    private static final String[] TEST_CASES = {
            "samples",                  // mixed sample files
            "test/empty",               // edge case: empty folder
            "test/no_permission",       // simulate with restricted access
            "test/unknown_extensions",  // files with unrecognized extensions
            "test/duplicates",          // files with similar names
    };

    // Store summary results
    static class TestSummary {
        String folderName;
        int filesDetected;
        int filesMoved;
        int failures;

        TestSummary(String folderName) {
            this.folderName = folderName;
        }
    }

    public static void main(String[] args) {
        List<TestSummary> results = new ArrayList<>();

        for (String folder : TEST_CASES) {
            String fullPath = new File(folder).getAbsolutePath();
            System.out.println("\n🔍 Running test on: " + fullPath);

            TestSummary summary = new TestSummary(folder);

            List<File> files = FileOrganizer.detectFiles(fullPath);
            summary.filesDetected = files.size();

            for (File file : files) {
                String type = FileOrganizer.getFileType(file);
                boolean success = FileOrganizer.moveFile(file, fullPath + "/" + type);
                if (success) {
                    summary.filesMoved++;
                } else {
                    summary.failures++;
                }
            }

            results.add(summary);
        }

        // Final summary
        System.out.println("\n📋 TEST RUN SUMMARY");
        System.out.println("----------------------------------------");
        for (TestSummary s : results) {
            System.out.printf("Folder: %-25s | Detected: %2d | Moved: %2d | Failed: %2d%n",
                    s.folderName, s.filesDetected, s.filesMoved, s.failures);
        }
        System.out.println("----------------------------------------");
    }
}