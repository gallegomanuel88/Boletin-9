package bol.pkg9.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Calculos {

    double base;
    double altura;

    public double setBase() {
        do {
            base = Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));
        } while (base <= 0);
        return base;
    }

    public double setAltura() {
        do {
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce altura"));
        } while (altura <= 0);
        return altura;
    }

    public void area() {
        double area = (base * altura);
        JOptionPane.showMessageDialog(null, "El area es " + area);
    }
}
