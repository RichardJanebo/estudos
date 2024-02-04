import java.awt.Dimension;
import java.awt.Toolkit;



public class Resolucao {
    public static void main(String[] arg){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
         int largura =  (int) dimension.getWidth();
         int altutura = (int) dimension.getHeight();

         System.out.print("A altura é "+ altutura +"E a largura é"+ largura );
    }
    
}