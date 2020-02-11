import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marco extends JFrame implements ActionListener {

    GridLayout gridLayout;
    JButton[] casillas;


    public Marco() throws HeadlessException {

        gridLayout = new GridLayout(3, 3);
        setLayout(gridLayout);

        casillas = new Casilla[9];

        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new Casilla();
            add(casillas[i]);
            casillas[i].addActionListener(this);
        }


        setSize(300, 300);
        setPreferredSize(new Dimension(300, 300));
        setVisible(true);
        pack();

    }

    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i < casillas.length; i++) {
            if (!casillas[i].getBackground().equals(Color.red))
                casillas[i].setBackground(Color.RED);
            else if (casillas[i].getBackground().equals(Color.RED))
                casillas[i].setBackground(Color.GREEN);
        }
    }
}
