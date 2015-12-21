package sk.onko.bracketcolors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ondrej.janosik on 21/12/2015.
 */
public class BtnColorBrackets extends JButton {

    private String parsedString = "";
    private BracketFinder bracketFinder;

    public BtnColorBrackets(JLabel coloredLabel, JTextField textField1) {
        this.setSize(100, 50);
        this.setText("Color brackets !");

        bracketFinder = new BracketFinder(getParsedString());

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setParsedString(textField1.getText());

               // bracketFinder.setInputText(parsedString);
              //  bracketFinder.findBrackets();

                System.out.print(parsedString);

                coloredLabel.setText(ColoredStringMaker.getColoredString(parsedString));
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
