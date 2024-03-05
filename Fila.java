
package fila;

import javax.swing.JOptionPane;

public class Fila {
    
        private int inicio;
        private int fim;
        private int n;
        private int vet[];

        
        public Fila(){
        n = Integer.parseInt(JOptionPane.showInputDialog("insira o tamanho da fila: "));
        
        vet = new int[n];

        }
    
    public static void main(String[] args) {
       
        
        
    }
    
}
