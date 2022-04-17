package net.wanlei.ui;

import net.wanlei.data.dao.DbTools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    final int DEFAULT_WIDTH = 800;
    final int DEFAULT_HEIGHT = 600;

    public MainFrame() {
        DbTools.check();

        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel.add(new TextButton("a", "fabbbbb"));
        panel.add(new TextButton("b", "fdafdasfds"));
        JButton button = new JButton("+");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                (new TextEditorPane()).setVisible(true);
            }
        });

        panel.add(button);

        this.add(panel);
    }
}
