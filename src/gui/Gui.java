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
        super("Titulo");
        initialcomponents();
        botton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
              System.out.println("hola mundo");
              caja2.setText(caja1.getText());
            }
        });
    }
    private JTextField caja1,caja2;
    private JButton botton;
            
    public void initialcomponents (){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        caja1 =new JTextField();
        caja1.setBounds(10,100,150,30);
                     
        caja2= new JTextField();
        caja2.setBounds(10,150,150,30);
        
         botton=new JButton("click");
        botton.setBounds(10,200,150,30);
       Container container=getContentPane();
        container.add(caja1);
        container.add(caja2);
        container.add (botton);
        
        //Bbotton=new 
       
        setSize(300,300);
        
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
