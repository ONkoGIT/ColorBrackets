package sk.onko.bracketcolors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ondrej on 21/12/2015.
 */
public class BtnColorBrackets extends JButton {


    private String parsedString = "";

    public BtnColorBrackets(JLabel coloredLabel, JTextArea textField1) {
        this.setSize(100, 50);
        this.setText("<html>  &nbsp;&nbsp;Color<br />brackets </html>");
        // this.setBackground(new Color(255,255,255));

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setParsedString(textField1.getText());

                System.out.print(parsedString);

                BracketScanner bs = new BracketScanner();

                String outputStringFromScanner = bs.getHtmlString(parsedString);

                coloredLabel.setText(outputStringFromScanner);

            }
        });

    }

    public String getParsedString() {
        return parsedString;
    }

    public void setParsedString(String parsedString) {
        this.parsedString = parsedString;
    }

}
