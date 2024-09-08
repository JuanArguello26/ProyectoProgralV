import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exercise2_12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        framecalculator myframe= new framecalculator();

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myframe.setVisible(true);
    }
}

class framecalculator extends JFrame{

    public framecalculator() {

        setTitle("Calculator");

        setBounds(500,300,450,300);

        LamC mylam= new LamC();

        add(mylam);

    }
}

class LamC extends JPanel{

    public LamC() {

        begin=true;

        setLayout(new BorderLayout());

        screen = new JButton("0");

        screen.setEnabled(false);

        add(screen, BorderLayout.NORTH);

        mylam2= new JPanel();

        mylam2.setLayout(new GridLayout(4,4));

        ActionListener insert= new InsertNum();

        ActionListener order= new AccionOrder();

        addmybutton("7", insert);

        addmybutton("8", insert);

        addmybutton("9", insert);

        addmybutton("/", order);

        addmybutton("4", insert);

        addmybutton("5", insert);

        addmybutton("6", insert);

        addmybutton("*", order);

        addmybutton("1", insert);

        addmybutton("2", insert);

        addmybutton("3", insert);

        addmybutton("-", order);

        addmybutton("0", insert);

        addmybutton(".", insert);

        addmybutton("=", order);

        addmybutton("+", order);

        add(mylam2, BorderLayout.CENTER);

        lastop="=";

    }

    private void addmybutton (String mylabel, ActionListener mylistener) {

        JButton boton= new JButton(mylabel);

        boton.addActionListener(mylistener);

        mylam2.add(boton);

    }

    private class InsertNum implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            String entry= e.getActionCommand();

            if(begin) {

                screen.setText("");

                begin=false;

            }

            screen.setText(screen.getText() + entry);

        }

    }

    private class AccionOrder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            String op = e.getActionCommand();

            System.out.println(op);

            calc(Double.parseDouble(screen.getText()));

            lastop=op;

            begin=true;

        }

        public void calc(double x) {

            if(lastop.equals("+")) {

                result+=x;

                System.out.println(result);

            }
            else if(lastop.equals("-")) {

                result-=x;
            }

            else if(lastop.equals("*")) {

                result*=x;
            }
            else if(lastop.equals("/")) {

                result/=x;
            }
            else if(lastop.equals("=")) {

                result=x;
            }

            screen.setText("" + result);

        }
    }

    private JPanel mylam2;

    private JButton screen;

    private boolean begin;

    private double result;

    private String lastop;

}