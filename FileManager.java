import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class FileManager {

    // Метод для чтения файла
    public static String readFile(String filePath) throws FileNotFoundException, IOException {
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            content = sb.toString();
        }
        return content;
    }

    // Метод для записи файла
    public static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    // Метод для копирования файла
    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
