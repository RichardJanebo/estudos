package com.devdojo.javacore.ZZJcrud.repository;

import com.devdojo.javacore.ZZJcrud.conn.ConectionFactory;
import com.devdojo.javacore.ZZJcrud.dominio.Anime;
import com.devdojo.javacore.ZZJcrud.dominio.Producer;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        String sql = "select * from anime where name like ?";
        List<Anime> animes = new ArrayList<>();
        try (Connection con = ConectionFactory.getConnection();
                PreparedStatement statement = createPrepareSataStatementByNAme(con, sql, name);
                ResultSet rs = statement.executeQuery();) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                        Anime anime = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                        animes.add(anime);
                        

            }
            return animes;

        } catch (SQLException e) {
            log.error("Error while trying to find all animes", e);
            return animes;
        }
    }

    private static PreparedStatement createPrepareSataStatementByNAme(Connection connection, String sql, String nome)
            throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nome);
        return preparedStatement;

    }

    public static void save(Anime anime) {
        try (Connection connection = ConectionFactory.getConnection();
                PreparedStatement preparedStatement = savePreparedStatement(connection, anime);) {
            preparedStatement.execute();
            log.info("Executeded");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement savePreparedStatement(Connection connection, Anime anime)
            throws SQLException {
        String sql = "INSERT INTO anime_store.anime (name,episodes,producer_id) VALUES (?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, anime.getName());
        preparedStatement.setString(2, anime.getEpisodes().toString());
        preparedStatement.setString(3,anime.getProducer().getId().toString());

        return preparedStatement;

    }




    public static void delete(Anime anime) {
        try (Connection connection = ConectionFactory.getConnection();
                PreparedStatement preparedStatement = deletePreparedStatement(connection, anime);) {
            preparedStatement.execute();
            log.info("Delete Executeded");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement deletePreparedStatement(Connection connection, Anime anime)
            throws SQLException {
        String sql = "DELETE  from anime_store.anime WHERE name = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, anime.getName());
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
        String sql = "update `anime` set `name` = ?  where `id`= ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, indice.toString());
        preparedStatement.setString(1, otherName);
        return preparedStatement;

    }
}
