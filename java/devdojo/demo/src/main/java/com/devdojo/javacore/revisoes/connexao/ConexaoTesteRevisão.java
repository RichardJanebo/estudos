package com.devdojo.javacore.revisoes.connexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoTesteRevisão {
    public static Connection realizarConexao() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String name = "root";
        String password = "root";

        return DriverManager.getConnection(url, name, password);
    }
}
