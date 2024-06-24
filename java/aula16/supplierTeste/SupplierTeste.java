package aula16.supplierTeste;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;;



public class SupplierTeste {
    public static void main(String[] args){
        

        List<String> listaSaudacoes = Stream.generate(() -> "Ola Sejam bem vindos")
        .limit(5)
        .toList();

        listaSaudacoes.forEach(s -> System.out.println(s));
    }


}
