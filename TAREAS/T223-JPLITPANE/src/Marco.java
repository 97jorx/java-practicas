import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Marco extends JFrame implements ListSelectionListener {

    private Panel panel;
    private JTextArea jTextArea;
    private JSplitPane jSplitPane;


    private String[] nombres = {"JUANITO", "JORGITO", "PEPITO", "JOSELITO", "JAIMITO"};
    private JList list;

    public Marco() throws HeadlessException {

        // PANELES
        panel = new Panel();

        // TEXTOS
        jTextArea = new JTextArea(10, 10);

        // LISTA
        list = new JList(nombres);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        panel.add(list);

        // SEPARADOR IZQUIERDA/DERECHA
        jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, jTextArea);
        add(jSplitPane, BorderLayout.CENTER);


        setPreferredSize(new Dimension(300, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()){
            jTextArea.append(list.getSelectedValue().toString()+"\n");
        }

    }
}
