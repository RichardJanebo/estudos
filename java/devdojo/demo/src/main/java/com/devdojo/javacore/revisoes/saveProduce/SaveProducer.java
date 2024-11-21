package com.devdojo.javacore.revisoes.saveProduce;

import java.sql.Connection;
import java.sql.Statement;

import com.devdojo.javacore.revisoes.connexao.ConexaoTesteRevisão;
import com.devdojo.javacore.revisoes.model.ProducerRevisao;


public class SaveProducer {

    public static void save(ProducerRevisao producerRevisao) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".format(producerRevisao.getNome()) ;
        try (Connection con = ConexaoTesteRevisão.realizarConexao();
                Statement statement = con.createStatement();) {
                    int executeUpdate = statement.executeUpdate(sql);
                    System.out.println(executeUpdate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
