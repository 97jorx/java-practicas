import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class VentanaLista extends JPanel {

    private String[] nombres = {"JUANITO", "JORGITO", "PEPITO", "JOSELITO", "JAIMITO"};
    private JList izquierdo;
    private JList derecho;
    PanelBotones panelBotones;

    public VentanaLista() {

        panelBotones = new PanelBotones();
        izquierdo = new JList();
        derecho = new JList();

        DefaultListModel<String> listaNombresDer = new DefaultListModel();
        DefaultListModel<String> listaNombresIzq = new DefaultListModel();
        for (int i = 0; i < nombres.length; i++) {
            listaNombresIzq.addElement(nombres[i]);
        }
        izquierdo.setModel(listaNombresIzq);
        izquierdo.setPreferredSize(new Dimension(200, 150));
        izquierdo.setBorder(BorderFactory.createEtchedBorder());

        derecho.setModel(listaNombresDer);
        derecho.setPreferredSize(new Dimension(200, 150));
        derecho.setBorder(BorderFactory.createEtchedBorder());

        setLayout(new GridBagLayout());
        GridBagConstraints bagConstraints = new GridBagConstraints();


        panelBotones.getBoton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (!listaNombresIzq.isEmpty()) {
                    listaNombresDer.addElement(String.valueOf(izquierdo.getSelectedValue()));
                    try {
                        listaNombresIzq.removeElementAt(izquierdo.getSelectedIndex());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                } else if (izquierdo.isSelectionEmpty()){
                    
                }
            }
        });

        panelBotones.getBoton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!listaNombresDer.isEmpty()){
                    listaNombresIzq.addElement(String.valueOf(derecho.getSelectedValue()));
                    listaNombresDer.removeElementAt(derecho.getSelectedIndex());
                }
            }
        });

        panelBotones.getBoton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!listaNombresIzq.isEmpty())
                    for (int i = 0; i < nombres.length; i++) {
                        listaNombresDer.add(i, listaNombresIzq.getElementAt(i));
                    }
                listaNombresIzq.removeAllElements();
            }
        });

        panelBotones.getBoton4().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!listaNombresDer.isEmpty())
                    for (int i = 0; i < nombres.length; i++) {
                        listaNombresIzq.add(i, listaNombresDer.getElementAt(i));
                    }
                listaNombresDer.removeAllElements();

            }
        });

        // JTEXTAREA IZQUIERDO
        bagConstraints.weightx = 1;
        bagConstraints.weighty = 1.1;

        bagConstraints.gridx = 0;
        bagConstraints.gridy = 1;
        bagConstraints.anchor = GridBagConstraints.WEST;
        bagConstraints.insets = new Insets(0, 20, 0, 0);
        add(izquierdo, bagConstraints);

        // BOTONES VERTICAL EN EL CENTRO
        bagConstraints.weightx = 1;
        bagConstraints.weighty = 1.1;

        bagConstraints.gridx = 1;
        bagConstraints.gridy = 1;
        bagConstraints.anchor = GridBagConstraints.CENTER;
        bagConstraints.insets = new Insets(0, 0, 0, 0);
        add(panelBotones, bagConstraints);

        // JTEXTAREA DERECHO
        bagConstraints.weightx = 1;
        bagConstraints.weighty = 1.1;

        bagConstraints.gridx = 2;
        bagConstraints.gridy = 1;
        bagConstraints.anchor = GridBagConstraints.EAST;
        bagConstraints.insets = new Insets(0, 0, 0, 20);
        add(derecho, bagConstraints);


    }
}
