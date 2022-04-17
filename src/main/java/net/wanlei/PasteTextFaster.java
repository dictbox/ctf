package net.wanlei;

import net.wanlei.ui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class PasteTextFaster {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setTitle("快粘贴");



            mainFrame.setVisible(true);
        });
    }
}
