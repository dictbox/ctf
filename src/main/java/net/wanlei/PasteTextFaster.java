package net.wanlei;

import net.wanlei.ui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class PasteTextFaster {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:./ctf", "sa", "123456");
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);
        statement.executeUpdate("create schema ctf");
        statement.executeUpdate("create table person (id integer, name varchar(20) )");
        statement.executeUpdate("insert into person values(1, 'leo')");
        statement.executeUpdate("insert into person values(2, 'yui')");


        EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setTitle("快粘贴");
            mainFrame.setVisible(true);
        });
    }
}
