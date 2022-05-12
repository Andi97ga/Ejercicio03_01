/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio03_01;

/**
 *
 * @author User
 */
public class Ejercicio03_01 {

    public static void main(String[] args) {
        var v= new Ventana1("Animales_BorderLayout");
        v.setVisible(true);
        var v2= new Ventana2("Animales_GridLayout");
        v2.setVisible(true);
        var v3= new Ventana3("Animales_FlowLayout");
        v3.setVisible(true);
        var v4=new Bandera("Paises");
        v4.setVisible(true);
    }
}
