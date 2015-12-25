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

        // this.setLayout(null);
        this.setLayout(new GridBagLayout());

        //  textField1.setBounds(50, 40, (width - 100), (height - 300));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);

        textField1.setFont(appFont);
        textField1.setPreferredSize(new Dimension(500, 90));
        c.gridx = 0;
        c.gridy = 0;
        this.add(textField1, c);

        coloredBrackets = new JLabel("Colored brackets will appear here");
        // coloredBrackets.setBounds(50, (height - 280), (width - 100), (height - 300));
        coloredBrackets.setPreferredSize(new Dimension(500, 90));
        coloredBrackets.setFont(appFont);
        this.setVisible(true);
        c.gridx = 0;
        c.gridy = 1;
        this.add(coloredBrackets, c);

        btnColorBrackets = new BtnColorBrackets(coloredBrackets, textField1);
        btnColorBrackets.setPreferredSize(new Dimension(150, 300));
        // btnColorBrackets.setBounds(50, (height - 200), (width - 100), (height - 300));
        btnColorBrackets.setFont(appFont);
        btnColorBrackets.setVisible(true);
        c.gridheight=2;
        c.gridx = 1;
        c.gridy = 0;
        this.add(btnColorBrackets, c);


        this.setSize(width, height);

        textField1.setVisible(true);
        this.setVisible(true);
    }


}
