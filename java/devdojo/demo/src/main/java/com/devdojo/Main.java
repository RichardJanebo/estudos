package com.devdojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer.ProducerBuilder()
                .name("Laura")
                .build();

        ProducerServiceRevisao.save(producer);
    }

}

class ProducerServiceRevisao {
    public static void save(Producer producer) {
        ProducerRepositoryRevisao.create(producer);
    }

}

class ProducerRepositoryRevisao {
    public static void create(Producer producer) {
        String sql = "INSERT INTO producer (name) VALUES (?)";
        try (Connection connection = ConnectionRevisaoFactory.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, producer.getName());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

class ConnectionRevisaoFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String name = "root";
        String passaWord = "root";

        return DriverManager.getConnection(url, name, passaWord);
    }

}

class Producer {
    String name;
    int id; // Generated dataBase

    private Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static final class ProducerBuilder {
        private String name;

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            return new Producer(name);
        }

    }

}
