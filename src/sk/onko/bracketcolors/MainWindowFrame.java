package sk.onko.bracketcolors;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ondrej.janosik on 21/12/2015.
 */
public class MainWindowFrame extends JFrame {

    private final int WINDOW_HEIGHT = 450;
    private final int WINDOW_WIDTH = 800;

    private JMenuBar menuBar = new JMenuBar();

    private MainWindowPanel mainWindowPanel;


    private MainWindowFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle("Color Brackets");

        menuBar.setLayout(new GridBagLayout());
        menuBar.add(new JMenuItem("Settings"));
        menuBar.add(new JMenuItem("About"));
        this.setJMenuBar(menuBar);

        mainWindowPanel = new MainWindowPanel(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(mainWindowPanel);

        this.setVisible(true);

    }

    private static MainWindowFrame ourInstance = new MainWindowFrame();


    public static MainWindowFrame getInstance() {
        return ourInstance;
    }


}
