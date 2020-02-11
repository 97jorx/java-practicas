import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Menu extends JPanel{

    private JMenuBar menuBar;

    private JMenu archivo;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenuItem menuItem7;


    private JMenu edicion;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JMenuItem menuItem10;
    private JMenuItem menuItem11;
    private JMenuItem menuItem12;
    private JMenuItem menuItem13;
    private JMenuItem menuItem14;
    private JMenuItem menuItem15;
    private JMenuItem menuItem16;
    private JMenuItem menuItem17;
    private JMenuItem menuItem18;
    private JMenuItem menuItem19;


    private JMenu formato;
    private JMenuItem menuItem20;
    private JMenuItem menuItem21;


    private JMenu ver;
    private JMenuItem menuItem22;
    private JMenuItem menuItem23;


    private JMenu ayuda;
    private JMenuItem menuItem24;
    private JMenuItem menuItem25;

    private JFileChooser jfc;


    public Menu() {
        setLayout(new BorderLayout());

        jfc = new JFileChooser();
        archivo = new JMenu("Archivo");
        edicion = new JMenu("Edición");
        formato = new JMenu("Formato");
        ver = new JMenu("Ver");
        ayuda = new JMenu("Ayuda");

        menuBar = new JMenuBar();
        menuItem1 = new JMenuItem("Nuevo");
        menuItem2 = new JMenuItem("Abrir");
        menuItem3 = new JMenuItem("Guardar");
        menuItem4 = new JMenuItem("Guardar como...");
        menuItem5 = new JMenuItem("Configuracion de página");
        menuItem6 = new JMenuItem("imprimir");
        menuItem7 = new JMenuItem("Salir");

        // ARCHIVO
        archivo.add(menuItem1);
        archivo.add(menuItem2);
        archivo.add(menuItem3);
        archivo.add(menuItem4);
        archivo.addSeparator();
        archivo.add(menuItem5);
        archivo.add(menuItem6);
        archivo.addSeparator();
        archivo.add(menuItem7);




        //EDICION

        menuItem8 = new JMenuItem("Deshacer");
        menuItem9 = new JMenuItem("Cortar");
        menuItem10 = new JMenuItem("Copiar");
        menuItem11 = new JMenuItem("Pegar");
        menuItem12 = new JMenuItem("Eliminar");
        menuItem13 = new JMenuItem("Búsqueda con Bing..-");
        menuItem14 = new JMenuItem("Buscar..");
        menuItem15 = new JMenuItem("Buscar siguiente");
        menuItem16 = new JMenuItem("Reemplazar");
        menuItem17 = new JMenuItem("Ir a...");
        menuItem18 = new JMenuItem("Seleccionar todo");
        menuItem19 = new JMenuItem("Hora y fecha");

        edicion.add(menuItem8);
        edicion.addSeparator();
        edicion.add(menuItem9);
        edicion.add(menuItem10);
        edicion.add(menuItem11);
        edicion.add(menuItem12);
        edicion.addSeparator();
        edicion.add(menuItem13);
        edicion.add(menuItem14);
        edicion.add(menuItem15);
        edicion.add(menuItem16);
        edicion.add(menuItem17);
        edicion.add(menuItem18);



        // FORMATO
        menuItem20 = new JMenuItem("Ajuste de linea");
        menuItem21 = new JMenuItem("Fuente...");

        formato.add(menuItem20);
        formato.add(menuItem21);

        // VER
        menuItem22 = new JMenuItem("Ajuste de linea");
        menuItem23 = new JMenuItem("Fuente...");

        ver.add(menuItem22);
        ver.add(menuItem23);

        //AYUDA
        menuItem24 = new JMenuItem("Ver la ayuda");
        menuItem25 = new JMenuItem("Acerca del blog de notas");

        ayuda.add(menuItem24);
        ayuda.add(menuItem25);


        add(menuBar);
        menuBar.add(archivo);
        menuBar.add(edicion);
        menuBar.add(formato);
        menuBar.add(ver);
        menuBar.add(ayuda);


        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jfc.getSelectedFile();
                    System.out.println(selectedFile.getName());
                }
            }
        });

    }
}
