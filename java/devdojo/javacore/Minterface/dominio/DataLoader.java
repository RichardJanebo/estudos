package devdojo.javacore.Minterface.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {

        System.out.println("Fazendo checagem de permissões");

    }

    public static void retriteveMaXDataSize() {
        System.out.println("Dentro da interface");
    }

}
