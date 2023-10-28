public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "NoEsUnNumero";

        try {
            int num = Integer.parseInt(str); // Intenta convertir la cadena en un número (lanzará NumberFormatException)
            System.out.println("Número: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Se generó una NumberFormatException: " + e.getMessage());
        }
    }
}