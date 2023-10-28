public class IndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int element = array[5]; // Esto lanzará IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Se ha producido una excepción de índice fuera de límites.");
        }
    }
}
