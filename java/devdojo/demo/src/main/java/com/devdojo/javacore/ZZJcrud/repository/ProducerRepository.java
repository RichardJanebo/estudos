package com.devdojo.javacore.ZZJcrud.repository;

import com.devdojo.javacore.ZZJcrud.conn.ConectionFactory;
import com.devdojo.javacore.ZZJcrud.dominio.Producer;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        String sql = "select * from producer where name like ?";
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConectionFactory.getConnection();
                PreparedStatement statement = createPrepareSataStatementByNAme(con, sql, name);
                ResultSet rs = statement.executeQuery();) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
            return producers;

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
            return producers;
        }
    }

    private static PreparedStatement createPrepareSataStatementByNAme(Connection connection, String sql, String nome)
            throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nome);
        return preparedStatement;

    }

    public static void save(Producer producer) {
        try (Connection connection = ConectionFactory.getConnection();
                PreparedStatement preparedStatement = savePreparedStatement(connection, producer);) {
            preparedStatement.execute();
            log.info("Executeded");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement savePreparedStatement(Connection connection, Producer producer)
            throws SQLException {
        String sql = "INSERT INTO anime_store.producer (name) VALUES (?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        return preparedStatement;

    }




    public static void delete(Producer producer) {
        try (Connection connection = ConectionFactory.getConnection();
                PreparedStatement preparedStatement = deletePreparedStatement(connection, producer);) {
            preparedStatement.execute();
            log.info("Delete Executeded");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement deletePreparedStatement(Connection connection, Producer producer)
            throws SQLException {
        String sql = "DELETE  from anime_store.producer WHERE name = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        return preparedStatement;

    }

    public static void update(Integer indice , String otherName) {
        try (Connection connection = ConectionFactory.getConnection();
                PreparedStatement preparedStatement = updatePreparedStatement(connection ,indice ,otherName);) {
            preparedStatement.executeUpdate();
            log.info("Update Executed");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement updatePreparedStatement(Connection connection, Integer indice, String otherName)
            throws SQLException {
        String sql = "update `producer` set `name` = ?  where `id`= ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, indice.toString());
        preparedStatement.setString(1, otherName);
        return preparedStatement;

    }
}
