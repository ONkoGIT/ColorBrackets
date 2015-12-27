package sk.onko.bracketcolors;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ondrej on 21/12/2015.
 */
public class MainWindowPanel extends JPanel {

    private JTextArea textArea1 = new JTextArea();
    private JLabel coloredBrackets;
    private BtnColorBrackets btnColorBrackets;
    private BtnCopyToClipboard btnCopyToClipboard;
    private Font appFont = new Font("Calibri", Font.PLAIN, 22);

    MainWindowPanel(int width, int height) {

        // this.setLayout(null);
        this.setLayout(new GridBagLayout());

        //  textArea1.setBounds(50, 40, (width - 100), (height - 300));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);

        textArea1.setFont(appFont);
        textArea1.setPreferredSize(new Dimension(500, 90));
        textArea1.setRows(5);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        c.gridx = 0;
        c.gridy = 0;
        this.add(textArea1, c);

        coloredBrackets = new JLabel("Colored brackets will appear here");
        // coloredBrackets.setBounds(50, (height - 280), (width - 100), (height - 300));
        coloredBrackets.setPreferredSize(new Dimension(500, 90));
        coloredBrackets.setFont(appFont);
        this.setVisible(true);
        c.gridx = 0;
        c.gridy = 1;
        this.add(coloredBrackets, c);

        btnColorBrackets = new BtnColorBrackets(coloredBrackets, textArea1);
        btnColorBrackets.setPreferredSize(new Dimension(150, 150));
        // btnColorBrackets.setBounds(50, (height - 200), (width - 100), (height - 300));
        btnColorBrackets.setFont(appFont);
        btnColorBrackets.setVisible(true);
        c.gridheight=1;
        c.gridx = 1;
        c.gridy = 0;
        this.add(btnColorBrackets, c);

        btnCopyToClipboard = new BtnCopyToClipboard(coloredBrackets);
        btnCopyToClipboard .setPreferredSize(new Dimension(150, 150));
        btnCopyToClipboard .setFont(appFont);
        btnCopyToClipboard.setVisible(true);
        c.gridx = 1;
        c.gridy = 1;
        this.add(btnCopyToClipboard, c);

        this.setSize(width, height);

        textArea1.setVisible(true);
        this.setVisible(true);
    }


}
