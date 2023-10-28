import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElementExceptionExample {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            Iterator<String> iterator = list.iterator();
            String element = iterator.next(); // Esto lanzará NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("No se encontró ningún elemento.");
        }
    }
}
