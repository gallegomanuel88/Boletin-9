
package bol.pkg9.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Calculos {
    public void calcular (){
        int sumar = 0;
        double producto = 1;
        
        for (int i = 10; i < 91; i++){
            sumar = i + sumar;
            producto= i * producto;
    }
        JOptionPane.showMessageDialog(null, "El resultado de la suma es "+sumar);
        JOptionPane.showMessageDialog(null, "El resultado del producto es "+producto);
    }
}
