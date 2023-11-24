/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package indexof;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ejercicio {
      public static void main(String[] args) {
        // Solicitar la letra a buscar
        String letraABuscar = JOptionPane.showInputDialog("Ingrese la letra a buscar:");

        // Verificar que solo se haya ingresado una letra
        if (letraABuscar.length() != 1) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo una letra.");
            return;
        }

        // Solicitar la palabra
        String palabra = JOptionPane.showInputDialog("Ingrese la palabra a comprobar:");

        // Buscar la letra en la palabra
        int indice = palabra.indexOf(letraABuscar.charAt(0));

        // Verificar si la letra está en la palabra
        if (indice != -1) {
            JOptionPane.showMessageDialog(null, "La letra '" + letraABuscar + "' está en la palabra.");
        } else {
            JOptionPane.showMessageDialog(null, "La letra '" + letraABuscar + "' no está en la palabra.");
        }
    }
}

