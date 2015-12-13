
package bol.pkg9.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Numeros {
    int pos;
    int neg;
    int cero;
    
    public void contador (){
        for (int i=0; i<10; i++){
            String dato = JOptionPane.showInputDialog("Intruduce numero ");
            double num = Double.parseDouble(dato);
            if (num>0){
                pos++;
        }
            else if (num<0){
                neg++;
        }
            else if (num==0){
                cero++;
        }
        }
    }
    public void setMostrar (){
        JOptionPane.showMessageDialog(null, "La cantidad de numeros positivos es "+pos);
        JOptionPane.showMessageDialog(null, "La cantidad de numeros negativos es "+neg);
        JOptionPane.showMessageDialog(null, "La cantidad de ceros es de "+cero);
    }
}
