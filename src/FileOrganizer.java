
import java.util.Scanner;


public class FileOrganizer {
    public static void main(String[] args) {
        // Example usage (you can replace this path with any local directory)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String str = input.next();
//        //import detectFile class
//        DetectFiles newFiles = new DetectFiles();
//
//        //import categorizeFile class
//        CategorizeFiles nextFiles = new CategorizeFiles();
//
//        //import moveFile class
//        MoveFiles moveFiles = new MoveFiles();

        // implement file organizer
        DetectFiles.detectFiles(str);
        CategorizeFiles.categorizeFiles(str);
        MoveFiles.categorizeAndMoveFiles(str);
    }
}