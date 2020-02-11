package Lesson16ComboBoxes;

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
    private JComboBox empCombo;


    public FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);


        nameLabel = new JLabel("Nombre: ");
        occupationLabel = new JLabel("Ocupacion: ");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);
        ageList = new JList<>();
        empCombo = new JComboBox();

        // Set up list box
        DefaultListModel ageModel = new DefaultListModel<>();
        ageModel.addElement(new AgeCategory(0, "Under 18"));
        ageModel.addElement(new AgeCategory(1, "18 to 65"));
        ageModel.addElement(new AgeCategory(2, "65 or over"));
        ageList.setModel(ageModel);

        ageList.setPreferredSize(new Dimension(110, 66));
        ageList.setBorder(BorderFactory.createEtchedBorder());
        ageList.setSelectedIndex(1);

        // Set up combo box
        DefaultComboBoxModel empMOdel = new DefaultComboBoxModel();
        empMOdel.addElement("Empresario");
        empMOdel.addElement("Semi-Empresario");
        empMOdel.addElement("Desempleado");
        empCombo.setModel(empMOdel);
        empCombo.setSelectedIndex(0);
        empCombo.setEditable(true);

        okBtn = new JButton("OK");

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String occupation = occupationField.getText();
                AgeCategory ageCat = (AgeCategory) ageList.getSelectedValue();
                String empCat = (String)empCombo.getSelectedItem();

                System.out.println(empCat);

                FormEvent ev = new FormEvent(this, name, occupation, ageCat.getId(), empCat);

                if (formListener != null) {
                    formListener.formEventOcurred(ev);
                }
            }
        });


        Border innerBorder = BorderFactory.createTitledBorder("Añadir persona");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        layoutComponents();


    }

    public void layoutComponents(){
        setLayout(new GridBagLayout());

        GridBagConstraints go = new GridBagConstraints();


        //PRIMERO LINEA

        go.gridy = 0;

        go.weightx = 1;
        go.weighty = 0.1;

        go.gridx = 0;
        go.fill = GridBagConstraints.NONE;
        go.anchor = GridBagConstraints.LINE_END;
        go.insets = new Insets(0, 0, 0, 5);
        add(nameLabel, go);

        go.gridx = 1;
        go.insets = new Insets(0, 0, 0, 0);
        go.anchor = GridBagConstraints.LINE_START;
        add(nameField, go);

        //SEGUNDA LINEA
        go.gridy++;

        go.weightx = 1;
        go.weighty = 0.1;

        go.gridx = 0;
        go.insets = new Insets(0, 0, 0, 5);
        go.anchor = GridBagConstraints.LINE_END;
        add(occupationLabel, go);


        go.gridx = 1;
        go.insets = new Insets(0, 0, 0, 0);
        go.anchor = GridBagConstraints.LINE_START;
        add(occupationField, go);

        //TERCERA LINEA
        go.gridy++;

        go.weightx = 1;
        go.weighty = 0.2;

        go.gridx = 0;
        go.insets = new Insets(0, 0, 0, 5);
        go.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Edad: "), go);

        go.gridx = 1;
        go.anchor = GridBagConstraints.FIRST_LINE_START;
        go.insets = new Insets(0, 0, 0, 0);
        add(ageList, go);

        //TERCERA LINEA
        go.gridy++;

        go.weightx = 1;
        go.weighty = 0.2;

        go.gridx = 0;
        go.insets = new Insets(0, 0, 0, 5);
        go.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Puesto: "), go);

        go.gridx = 1;
        go.anchor = GridBagConstraints.FIRST_LINE_START;
        go.insets = new Insets(0, 0, 0, 0);
        add(empCombo, go);

        //CUARTA LINEA
        go.gridy++;

        go.weightx = 1;
        go.weighty = 2.0;


        go.gridx = 1;
        go.anchor = GridBagConstraints.FIRST_LINE_START;
        go.insets = new Insets(0, 0, 0, 0);
        add(okBtn, go);
    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }

    class AgeCategory {
        private int id;
        private String text;

        public AgeCategory(int id, String text) {
            this.id = id;
            this.text = text;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return text;


        }
    }
}
