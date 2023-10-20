import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.Scanner;

public class ProgramaHilos {
    public static void main(String[] args) {
        ProgramaHilos.reproducirCancion("junior.wav");
        interactuarConUsuario();
    }

    public static void reproducirCancion(String nombreArchivo) {
        Thread reproductorThread = new Thread(() -> {
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ProgramaHilos.class.getResource(nombreArchivo));
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
                clip.close();
                audioInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        reproductorThread.start();
    }

    static void interactuarConUsuario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cómo te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");
        
        System.out.println("¿Cómo estás?");
        String respuesta = scanner.nextLine();
        System.out.println("Me alegro de que estés " + respuesta + "!");
        
        System.out.println("¿A que te dedicas?");
        String oficio = scanner.nextLine();
        System.out.println("Que Excelente trabajo!");

	System.out.println("Fin de la conversación");
        scanner.close();
    }
}
