import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("archivo_que_no_existe.txt");
            Scanner scanner = new Scanner(file); // Esto lanzará FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no pudo ser encontrado.");
        }
    }
}
