/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.awt.EventQueue;

/**
 *
 * @author Dell
 */
public class Calculadora {
    
    public static void main(String[] args) {
         EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            try {
                InterfazC interfaz = new InterfazC();

                interfaz.getContentPane().setBackground(
                        java.awt.Color.BLACK
                );

                interfaz.setLocationRelativeTo(null);
                interfaz.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
     });
    }
}
        
    

