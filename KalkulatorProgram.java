package kalkulatorprogram;

import javax.swing.JOptionPane;

public class KalkulatorProgram {
    public static void main(String[] args) {
            Kalkulator k = new Kalkulator();
            try {
            k.osszead("a", "2");
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "hiba");
        }
    }
    
}
