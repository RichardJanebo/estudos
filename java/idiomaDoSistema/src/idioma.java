import java.util.Locale;

public class idioma {
    public static void main(String[] args){
        Locale local = Locale.getDefault();
        String idioma = local.getLanguage();
        System.out.print(idioma);
    }
    
}
