package Lesson13CustomEventsandFormSubmission;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private FormListener formListener;


    public FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);


        nameLabel = new JLabel("Nombre: ");
        occupationLabel = new JLabel("Ocupacion: ");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);

        okBtn = new JButton("OK");

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String occupation = occupationField.getText();

                FormEvent ev = new FormEvent(this, name, occupation);

                if(formListener != null){
                    formListener.formEventOcurred(ev);
                }
            }
        });



        Border innerBorder = BorderFactory.createTitledBorder("Añadir persona");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints go = new GridBagConstraints();



        //PRIMERO LINEA

        go.weightx = 1;
        go.weighty = 0.1;

        go.gridx = 0;
        go.gridy = 0;
        go.fill = GridBagConstraints.NONE;
        go.anchor = GridBagConstraints.LINE_END;
        go.insets = new Insets(0,0,0,5);
        add(nameLabel, go);

        go.gridx = 1;
        go.gridy = 0;
        go.insets = new Insets(0,0,0,0);
        go.anchor = GridBagConstraints.LINE_START;
        add(nameField, go);

        //SEGUNDA LINEA
        go.weightx = 1;
        go.weighty = 0.1;

        go.gridy = 1;
        go.gridx = 0;
        go.insets = new Insets(0,0,0,5);
        go.anchor = GridBagConstraints.LINE_END;
        add(occupationLabel, go);

        go.gridy = 1;
        go.gridx = 1;
        go.insets = new Insets(0,0,0,0);
        go.anchor = GridBagConstraints.LINE_START;
        add(occupationField, go);

        //TERCERA LINEA
        go.weightx = 1;
        go.weighty = 2.0;

        go.gridy = 2;
        go.gridx = 1;
        go.anchor = GridBagConstraints.FIRST_LINE_START;
        add(okBtn, go);

    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }
}
