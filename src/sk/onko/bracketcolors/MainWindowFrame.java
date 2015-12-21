package sk.onko.bracketcolors;

import javax.swing.*;

/**
 * Created by ondrej.janosik on 21/12/2015.
 */
public class MainWindowFrame extends JFrame {

    private final int WINDOW_HEIGHT = 400;
    private final int WINDOW_WIDTH = 700;

    private MainWindowPanel mainWindowPanel;


    private MainWindowFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        mainWindowPanel = new MainWindowPanel(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(mainWindowPanel);


        this.setVisible(true);

    }

    private static MainWindowFrame ourInstance = new MainWindowFrame();


    public static MainWindowFrame getInstance() {
        return ourInstance;
    }


}
