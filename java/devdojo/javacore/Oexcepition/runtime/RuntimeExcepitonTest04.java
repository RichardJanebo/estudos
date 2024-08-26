package devdojo.javacore.Oexcepition.runtime;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExcepitonTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro doIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro IllegalAccessException");

        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }


        try{
            maibeThrowsException();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void maibeThrowsException() throws SQLException , IOException{
        throw new SQLException();
    }
}
