package kalkulatorprogram;

import javax.swing.JOptionPane;

public class Kalkulator {

    public Kalkulator() {
    }
    
    public int osszead(String szam1, String szam2) throws NumberFormatException{
        int a = 0;
        int b = 0;
        a = Integer.parseInt(szam1);
        b = Integer.parseInt(szam2);
        
        return a + b;
    }
}
