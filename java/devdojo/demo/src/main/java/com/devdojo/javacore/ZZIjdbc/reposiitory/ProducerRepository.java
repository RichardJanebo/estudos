package com.devdojo.javacore.ZZIjdbc.reposiitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.devdojo.javacore.ZZIjdbc.com.ConectionFactory;
import com.devdojo.javacore.ZZIjdbc.model.Producer;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s')".formatted(producer.getName());
        try (Connection conn = ConectionFactory.getConnection();
                Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Database rows affected '{}'", rowsAffected);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    public static void delete(Producer producer) {
        String sql = "delete from `producer` where `name` = ('%s')".formatted(producer.getName());
        try (Connection conn = ConectionFactory.getConnection();
                Statement statement = conn.createStatement()) {
            int executeUpdate = statement.executeUpdate(sql);
            log.info("Database rowns affected '{}'", executeUpdate);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    public static void update(Producer producer) {

        try (Connection conn = ConectionFactory.getConnection();
                PreparedStatement statement = createPrepareSataStatementUpdate(conn, producer)) {
            int executeUpdate = statement.executeUpdate();
            log.info("Database rowns affected '{}'", executeUpdate);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    private static PreparedStatement createPrepareSataStatementUpdate(Connection connection, Producer producer)
            throws SQLException {
        String sql = "update `producer` set `name` = ?  where `id`= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;

    }

    public static List<Producer> findAll() {
        String sql = "select id, name from producer";
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConectionFactory.getConnection();
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(sql);) {
            while (rs.next()) {
                var id = rs.getInt("id");
                var name = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(name).build();
                producers.add(producer);
            }
            return producers;

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
            return producers;
        }

    }

    public static List<Producer> findByName(String name) {
        String sql = "select * from producer where name like '%s'"
                .formatted("%" + name + "%");
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConectionFactory.getConnection();
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(sql);) {
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

    public static List<Producer> findByNamePreaparedStatement(String name) {
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
}
