import java.io.FileNotFoundException;
import java.io.IOException;

public class MainMenu {  
    public static void main(String[] args) {

        String sourceFilePath = "path/to/source/file.txt";

        String destinationFilePath = "path/to/destination/file.txt";
        try {

            // Чтение файла
            String fileContent = FileManager.readFile(sourceFilePath);
            System.out.println("Содержимое файла: " + fileContent);

            // Запись файла
            String newContent = "Новое содержимое файла";
            FileManager.writeFile(sourceFilePath, newContent);
            System.out.println("Файл успешно записан.");

            // Копирование файла
            FileManager.copyFile(sourceFilePath, destinationFilePath);
            System.out.println("Файл успешно скопирован.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
