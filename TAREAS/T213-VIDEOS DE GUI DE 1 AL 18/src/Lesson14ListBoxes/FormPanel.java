package Lesson14ListBoxes;

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
    private JList ageList;


    public FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);


        nameLabel = new JLabel("Nombre: ");
        occupationLabel = new JLabel("Ocupacion: ");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);
        ageList = new JList<>();

        DefaultListModel<String> ageModel = new DefaultListModel<>();
        ageModel.addElement("Under 18");
        ageModel.addElement("18 to 65");
        ageModel.addElement("65 or over");
        ageList.setModel(ageModel);

        ageList.setPreferredSize(new Dimension(110, 66));
        ageList.setBorder(BorderFactory.createEtchedBorder());
        ageList.setSelectedIndex(1);

        okBtn = new JButton("OK");

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String occupation = occupationField.getText();
                String ageCat = (String)ageList.getSelectedValue();
                System.out.println(ageCat);

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
        go.insets = new Insets(0,0,0,0);
        add(ageList, go);

        //CUARTA LINEA
        go.weightx = 1;
        go.weighty = 2.0;

        go.gridy = 3;
        go.gridx = 1;
        go.anchor = GridBagConstraints.FIRST_LINE_START;
        go.insets = new Insets(0,0,0,0);
        add(okBtn, go);

    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }
}
