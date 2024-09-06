import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Procesador_II {

    public static void main(String[] args) {

        MenuProcesador_II mimarco= new MenuProcesador_II();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MenuProcesador_II extends JFrame{

    public MenuProcesador_II(){

        setBounds(500,300,550,400);

        LaminaProcesador_II milamina= new LaminaProcesador_II();

        add(milamina);

        setVisible(true);

    }
}

class LaminaProcesador_II extends JPanel{

    public LaminaProcesador_II(){

        setLayout(new BorderLayout());

        JPanel laminamenu= new JPanel();

        JMenuBar mibarra= new JMenuBar();
//------------------------------------------------------------
        JMenu fuente= new JMenu("Fuente");

        JMenu estilo= new JMenu("Estilo");

        JMenu tamagno= new JMenu("Tamaño");

//------------------------------------------------------------

        JMenuItem arial= new JMenuItem("Arial");

        arial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                miarea.setFont(new Font("Arial", Font.PLAIN, 12));

            }
        });

        JMenuItem courier= new JMenuItem("Courier");

        //Gestiona_menus tipo_letra=new Gestiona_menus();

        courier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                miarea.setFont(new Font("Courier", Font.PLAIN, 12));

            }
        });

        JMenuItem verdana= new JMenuItem("Verdana");

        verdana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                miarea.setFont(new Font("Verdana", Font.PLAIN, 12));

            }
        });

        fuente.add(arial);

        fuente.addSeparator();

        fuente.add(courier);

        fuente.addSeparator();

        fuente.add(verdana);

//-------------------------------------------------------------

        JMenuItem negrita= new JMenuItem("Negrita");

        JMenuItem cursiva= new JMenuItem("Cursiva");

        estilo.add(negrita);

        estilo.addSeparator();

        estilo.add(cursiva);

//--------------------------------------------------------------

        JMenuItem tam_12= new JMenuItem("12");

        JMenuItem tam_16= new JMenuItem("16");

        JMenuItem tam_20= new JMenuItem("20");

        JMenuItem tam_24= new JMenuItem("24");

        tamagno.add(tam_12);

        tamagno.addSeparator();

        tamagno.add(tam_16);

        tamagno.addSeparator();

        tamagno.add(tam_20);

        tamagno.addSeparator();

        tamagno.add(tam_24);

//---------------------------------------------------------------

        mibarra.add(fuente);

        mibarra.add(estilo);

        mibarra.add(tamagno);

        laminamenu.add(mibarra);

        add(laminamenu, BorderLayout.NORTH);

        miarea= new JTextPane();

        add(miarea, BorderLayout.CENTER);

//---------------------------------------------------------------



    }


    JTextPane miarea;  //Ojo con la declaracion de variables en las llaves, errores pendejos.
}