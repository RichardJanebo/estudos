package com.devdojo.javacore.ZZIjdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {

    public static Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String userName = "root";
        String password = "root";

        
        return  DriverManager.getConnection(url, userName, password);
    

}}