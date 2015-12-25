package sk.onko.bracketcolors;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ondrej.janosik on 21/12/2015.
 */
public class MainWindowPanel extends JPanel {

    private JTextField textField1 = new JTextField();
    private JLabel coloredBrackets;
    private BtnColorBrackets btnColorBrackets;
    private Font appFont = new Font("Calibri", Font.PLAIN, 22);

    MainWindowPanel(int width, int height) {

        this.setLayout(null);

        textField1.setBounds(50, 40, (width - 100), (height - 300));
        textField1.setFont(appFont);

        coloredBrackets = new JLabel("Colored brackets will appear here");
        coloredBrackets.setBounds(50, (height - 280), (width - 100), (height - 300));
        coloredBrackets.setFont(appFont);
        this.setVisible(true);
        this.add(coloredBrackets);

        btnColorBrackets = new BtnColorBrackets(coloredBrackets, textField1);
        btnColorBrackets.setBounds(50, (height - 200), (width - 100), (height - 300));
        btnColorBrackets.setFont(appFont);
        btnColorBrackets.setVisible(true);
        this.add(btnColorBrackets);

        this.add(textField1);

        this.setSize(width, height);

        textField1.setVisible(true);
        this.setVisible(true);
    }


}
