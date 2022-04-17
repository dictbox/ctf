package net.wanlei.data.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class DbTools {
    public static void check() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:h2:./ctf", "sa", "123456");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            statement.executeUpdate("create table if not exists TEXT_GROUP(ID INTEGER generated always as identity primary key,ROW_INDEX INTEGER,NAME CHARACTER VARYING(20),DESCRIPTION CHARACTER VARYING(200));");
            statement.executeUpdate("create table if not exists TEXT_ITEM(ID INTEGER generated always as identity primary key,ROW_INDEX INTEGER,NAME CHARACTER VARYING(20),DESCRIPTION CHARACTER VARYING(200));");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ignored) {
                }
            }
        }
    }
}
