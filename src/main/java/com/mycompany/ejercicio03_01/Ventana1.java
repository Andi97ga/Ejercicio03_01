/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_01;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class Ventana1 extends JFrame {
     private JPanel jPanel1;
    private List<JLabel> jLabelList;

    public Ventana1(String title) {
        super(title);
        this.setSize(300, 200);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        
    }
    
    
    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
     
        
    }
    public void iniciarPanel(){
        this.jPanel1 = new JPanel();
         this.jPanel1.setBackground(Color.GRAY);
         this.jPanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
         this.jPanel1.setLayout(new BorderLayout());
          
    }
   
        public void iniciarEtiquetas(){
            this.jLabelList =new ArrayList<>();
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            
           
            this.jLabelList.get(0).setBackground(Color.CYAN);
            this.jLabelList.get(0).setOpaque(true);
            this.jLabelList.get(0).setText("  Perro");
            this.jLabelList.get(1).setBackground(Color.GREEN);
            this.jLabelList.get(1).setOpaque(true);
            this.jLabelList.get(1).setText(" Caballo");
            this.jLabelList.get(2).setBackground(Color.ORANGE);
            this.jLabelList.get(2).setOpaque(true);
            this.jLabelList.get(2).setText("            Gato");
            this.jLabelList.get(3).setBackground(Color.LIGHT_GRAY);
            this.jLabelList.get(3).setOpaque(true);
            this.jLabelList.get(3).setText("  Loro");
            this.jLabelList.get(4).setBackground(Color.RED);
            this.jLabelList.get(4).setOpaque(true);
            this.jLabelList.get(4).setText("  Vaca");
            this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
            this.jPanel1.add(this.jLabelList.get(1),BorderLayout.SOUTH);
            this.jPanel1.add(this.jLabelList.get(2),BorderLayout.CENTER);
            this.jPanel1.add(this.jLabelList.get(3),BorderLayout.EAST);
            this.jPanel1.add(this.jLabelList.get(4),BorderLayout.WEST);
            
        }
}
