package net.wanlei.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextButton extends JButton implements ActionListener {
    private StringSelection clipboardText;

    public TextButton() {
        addActionListener(this);
        this.setClipboardText(new StringSelection("abc"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(this.getClipboardText(), null);
    }

    public StringSelection getClipboardText() {
        return clipboardText;
    }

    public void setClipboardText(StringSelection clipboardText) {
        this.clipboardText = clipboardText;
    }
}
