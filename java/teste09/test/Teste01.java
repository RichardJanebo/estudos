import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Teste01 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        // Abre o Bloco de Notas
        Runtime.getRuntime().exec("notepad.exe");
        Thread.sleep(2000);  // Espera 2 segundos

        // Digita texto
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_E);
        
    }
}
