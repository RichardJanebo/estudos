package devdojo.javacore.Qstring.teste;

public class StringPerformaceTeste {
    public static void main(String[] args) {
        // long initial = System.currentTimeMillis();
        // concatString(100_000);
        // long fim = System.currentTimeMillis();

        // System.out.println("Tempo gasto para String " + (fim - initial) + "ms");


        long initial = System.currentTimeMillis();
        concatStringBuffer(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - initial) + "ms");
        
    }

    public static void concatString(int tamanho){
        String texto = "";

        for(int i = 0;i< tamanho;i++){
            texto += i;
        }
        
    }
    public static void concatStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0;i < tamanho ; i++){
            stringBuilder.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0;i < tamanho ; i++){
            stringBuffer.append(i);
        }
    }
}
