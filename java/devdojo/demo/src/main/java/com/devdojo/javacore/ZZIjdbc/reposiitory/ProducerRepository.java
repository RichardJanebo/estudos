package com.devdojo.javacore.ZZIjdbc.reposiitory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.devdojo.javacore.ZZIjdbc.com.ConectionFactory;
import com.devdojo.javacore.ZZIjdbc.dominio.Producer;

public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s')".formatted(producer.getName());

        try (Connection conn = ConectionFactory.getConnection();
                Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
}
