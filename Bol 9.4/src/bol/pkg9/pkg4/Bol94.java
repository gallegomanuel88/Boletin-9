
package bol.pkg9.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Bol94 {

    public static void main(String[] args) {
        int num=0;
     TablaMultiplicar tabla1=new TablaMultiplicar();
     num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
     if(num!=0){
         JOptionPane.showMessageDialog(null,tabla1.calcularTabla(num));
     }
    }
    
}