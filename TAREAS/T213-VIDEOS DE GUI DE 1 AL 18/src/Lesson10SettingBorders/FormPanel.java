package Lesson10SettingBorders;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:59
 */
public class FormPanel extends JPanel {

    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okBtn;

    public FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);


        Border innerBorder = BorderFactory.createTitledBorder("Añadir persona");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }
}
