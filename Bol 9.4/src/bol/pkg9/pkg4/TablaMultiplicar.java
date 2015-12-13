package bol.pkg9.pkg4;

/**
 *
 * @author galle
 */
public class TablaMultiplicar {
    public String calcularTabla(int num){
       String tabla="";
       for(int x=1;x<=10;x++){
           tabla=tabla+"\n"+num+" * "+x+" = "+(num*x);
       }
        return tabla;
    }
}