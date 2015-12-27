package sk.onko.bracketcolors;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Ondrej on 21/12/2015.
 */
public class MainWindowFrame extends JFrame {

    private final int WINDOW_HEIGHT = 450;
    private final int WINDOW_WIDTH = 800;

    private JMenuBar menuBar = new JMenuBar();

    private MainWindowPanel mainWindowPanel;


    private MainWindowFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }



        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle("Color Brackets");

        try {
            this.setIconImage(ImageIO.read(new File("appIcon.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }


        menuBar.setLayout(new GridBagLayout());
        menuBar.add(new JMenuItem("Settings"));
        menuBar.add(new JMenuItem("About"));
      //  this.setJMenuBar(menuBar);

        mainWindowPanel = new MainWindowPanel(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(mainWindowPanel);

        this.setVisible(true);

    }

    private static MainWindowFrame ourInstance = new MainWindowFrame();


    public static MainWindowFrame getInstance() {
        return ourInstance;
    }


}
