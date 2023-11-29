import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class indexOf {
    public static int contarLetra(String palabra, char letra) {
        int contador = 0;
        int indice = palabra.indexOf(letra);

        while (indice != -1) {
            contador++;
            indice = palabra.indexOf(letra, indice + 1);
        }

        return contador;
    }
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        String letraInput = JOptionPane.showInputDialog("Ingrese la letra a contar:");

        // Validar que se haya ingresado solo una letra
        if (letraInput.length() != 1) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo una letra.");
            return;
        }

        char letraABuscar = letraInput.charAt(0);

        int cantidad = contarLetra(palabra, letraABuscar);

        JOptionPane.showMessageDialog(null, "La letra '" + letraABuscar + "' Esta " + cantidad + " en la posicion'" + palabra + "'.");
    }

}
    

