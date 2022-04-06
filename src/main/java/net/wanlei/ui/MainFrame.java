package net.wanlei.ui;

import javax.swing.*;

public class MainFrame extends JFrame {
    final int DEFAULT_WIDTH = 800;
    final int DEFAULT_HEIGHT = 600;

    public MainFrame() {
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.add(new TextButton());
    }
}
