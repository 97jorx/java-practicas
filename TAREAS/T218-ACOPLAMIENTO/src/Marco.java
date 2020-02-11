import javax.swing.*;
import java.awt.*;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:04
 */
public class Marco extends JFrame {


    private TextPanel textPanel;
    private Toolbar toolbar;
    private Menu menu;


    public Marco() {
        super("Hello World");

        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbar = new Toolbar();
        menu = new Menu();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void setEmited(String text) {
               textPanel.appendText(text);
            }
        });

        menu.setStringListener(new StringListener() {
            @Override
            public void setEmited(String text) {
                textPanel.appendText(text);
            }
        });

        add(toolbar, BorderLayout.SOUTH);
        add(textPanel, BorderLayout.CENTER);
        add(menu, BorderLayout.NORTH);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
