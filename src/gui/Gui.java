/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Gui extends JFrame{
    public Gui(){
        super("Calculadora");
        initialcomponents();
        botton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
              System.out.println("Resultado");
              caja2.setText(caja1.getText());
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("resta");
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Multi");
                            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Division");
                            }
        });
        
    }
    private JTextField caja1,caja2;
    private JButton botton, boton2,boton3,boton4;
            
    public void initialcomponents (){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        caja1 =new JTextField();
        caja1.setBounds(10,100,150,30);
                     
        caja2= new JTextField();
        caja2.setBounds(10,150,150,30);
        
         botton=new JButton("Sumar");
        botton.setBounds(10,200,150,30);
        boton2=new JButton("resta");
        boton2.setBounds(10,250,150,30);
        boton3=new JButton("resta");
        boton3.setBounds(10,300,150,30);
        boton4=new JButton("resta");
        boton4.setBounds(10,350,150,30);
       Container container=getContentPane();
        container.add(caja1);
        container.add(caja2);
        container.add (botton);
        container.add (boton2);
        container.add (boton3);
         container.add (boton4);
        
        
      
       
        setSize(300,500);
        
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
}
