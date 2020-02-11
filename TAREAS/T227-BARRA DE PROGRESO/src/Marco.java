import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marco extends JFrame {

    JProgressBar progressBar;
    JButton button;
    JPanel panel;

    public Marco() {
        super("Barra de progreso");

        panel = new JPanel();
        button = new JButton("+1");
        panel.setLayout(new BorderLayout());

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        panel.add(progressBar, BorderLayout.CENTER);
        panel.add(button, BorderLayout.NORTH);


        button.addActionListener(new ActionListener() {
            int contador = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();

                if (source.isEnabled()) {
                    progressBar.setValue(contador);
                    if (progressBar.getValue() == progressBar.getMaximum()) {
                        progressBar.setValue(0);
                    }
                }
                contador++;
            }

        });

        add(panel, BorderLayout.CENTER);

        setVisible(true);
        setPreferredSize(new Dimension(500, 500));
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
