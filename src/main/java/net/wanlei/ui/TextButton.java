package net.wanlei.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextButton extends JButton implements ActionListener {
    private StringSelection clipboardText;

    public TextButton(String text, String clipboardText) {
        this.setSize(100, 30);
        addActionListener(this);
        this.setText(text);
        this.setClipboardText(new StringSelection(clipboardText));
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
