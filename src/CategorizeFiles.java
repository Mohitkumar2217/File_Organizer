import java.util.HashMap;
import java.util.Map;
import java.io.File;

public class CategorizeFiles {

    // Maps extensions to folder names (you can customize this)
    private static final Map<String, String> typeMap = new HashMap<>();
    static {
        typeMap.put(".jpg", "Images");
        typeMap.put(".jpeg", "Images");
        typeMap.put(".png", "Images");
        typeMap.put(".gif", "Images");
        typeMap.put(".bmp", "Images");
        typeMap.put(".svg", "Vector images");
        typeMap.put(".webp", "Images");
        typeMap.put(".pdf", "Documents");
        typeMap.put(".doc", "WordDocs");
        typeMap.put(".docx", "WordDocs");
        typeMap.put(".xls", "ExcelSheets");
        typeMap.put(".xlsx", "ExcelSheets");
        typeMap.put(".ppt", "Presentations");
        typeMap.put(".pptx", "Presentations");
        typeMap.put(".odt", "OpenDocs");
        typeMap.put(".rtf", "TextFiles");
        typeMap.put(".txt", "TextFiles");
        typeMap.put(".mp3", "Audio");
        typeMap.put(".wav", "Audio");
        typeMap.put(".aac", "Audio");
        typeMap.put(".flac", "Audio");
        typeMap.put(".m4a", "Audio");
        typeMap.put(".mp4", "videos");
        typeMap.put(".mkv", "videos");
        typeMap.put(".mov", "videos");
        typeMap.put(".avi", "videos");
        typeMap.put(".wmv", "videos");
        typeMap.put(".java", "Source Code java");
        typeMap.put(".class", "Byte Code");
        typeMap.put(".py", "Source Code python");
        typeMap.put(".cpp", "Source Code c++");
        typeMap.put(".c", "Source Code c");
        typeMap.put(".js", "Scripts");
        typeMap.put(".html", "Markup");
        typeMap.put(".css", "Styles");
        typeMap.put(".json", "Config");
        typeMap.put(".xml", "Config");
        typeMap.put(".exe", "Executables");
        typeMap.put(".sys", "System Files");
        typeMap.put(".bat", "Scripts");
        typeMap.put(".msi", "Installers");
        typeMap.put(".dll", "Dynamic Link Library");
        typeMap.put(".zip", "Archives");
        typeMap.put(".rar", "Archives");
        typeMap.put(".tar", "Archives");
        typeMap.put(".gz", "Archives");
        typeMap.put(".7z", "Archives");
        typeMap.put(".log", "Logs");
        typeMap.put(".ini", "Config");
        typeMap.put(".db", "Databases");
        typeMap.put(".iso", "DiskImages");
        typeMap.put(".torrent", "PeerSharing");
    }

    public static String getFileType(File file) {
        String name = file.getName();
        int dotIndex = name.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == name.length() - 1) {
            return "Unknown";
        }
        String extension = name.substring(dotIndex).toLowerCase();
        return typeMap.getOrDefault(extension, "Misc");
    }

    public static void categorizeFiles(String directoryPath) {
        File dir = new File(directoryPath);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory: " + directoryPath);
            return;
        }

        File[] files = dir.listFiles(File::isFile);
        if (files == null || files.length == 0) {
            System.out.println("No files found to categorize.");
            return;
        }

        System.out.println("📌 Categorizing Files:");
        for (File file : files) {
            String category = getFileType(file);
            System.out.println(" - " + file.getName() + " → " + category);
        }
    }

}
