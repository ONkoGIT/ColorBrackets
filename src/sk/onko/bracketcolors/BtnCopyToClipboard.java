package sk.onko.bracketcolors;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ondrej on 27.12.2015.
 */
public class BtnCopyToClipboard extends JButton {

    private String stringToCopy = "";
    private JLabel referenceToOutputJLabel;

    public BtnCopyToClipboard(JLabel referenceToOutputJLabel) {
        this.referenceToOutputJLabel = referenceToOutputJLabel;
        this.setSize(100, 50);
        this.setText("<html> &nbsp;Copy HTML<br />to clipboard </html>");
        // this.setBackground(new Color(255,255,255));

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setStringToCopy(referenceToOutputJLabel.getText());

                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

                clipboard.setContents(new StringSelection(getStringToCopy()), null);

            }
        });

    }

    public String getStringToCopy() {
        return stringToCopy;
    }

    public void setStringToCopy(String stringToCopy) {
        this.stringToCopy = stringToCopy;
    }

}

