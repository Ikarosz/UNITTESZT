package kalkulatorprogram;

import org.junit.Test;
import static org.junit.Assert.*;

public class KalkulatorTest {
    
    public KalkulatorTest() {
    }

    /**
     * Test of osszead method, of class Kalkulator.
     */
    @Test(expected = NumberFormatException.class)
    public void testOsszeadUres() {
        System.out.println("osszead('','')");
        String szam1 = "";
        String szam2 = "";
        Kalkulator peldany = new Kalkulator();
        int kapottEredmeny = peldany.osszead(szam1, szam2);
        //int elvartEredmeny = 0;
        //assertEquals(elvartEredmeny, kapottEredmeny);
        fail("Kivételet várunk...");
    }
    
    @Test
    public void testOsszeadAzonosSzamokkal() {
        System.out.println("osszead(2,2)");
        String szam1 = "2";
        String szam2 = "2";
        Kalkulator peldany = new Kalkulator();
        int elvartEredmeny = 4;
        int kapottEredmeny = peldany.osszead(szam1, szam2);
        assertEquals(elvartEredmeny, kapottEredmeny);
    }
    
    @Test
    public void testOsszeadKulonbozoSzamokkal() {
        System.out.println("osszead(2,3)");
        String szam1 = "2";
        String szam2 = "3";
        Kalkulator peldany = new Kalkulator();
        int elvartEredmeny = 5;
        int kapottEredmeny = peldany.osszead(szam1, szam2);
        assertEquals(elvartEredmeny, kapottEredmeny);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testOsszeadNumberFormatException() {
        System.out.println("osszead(a,3)");
        String szam1 = "a";
        String szam2 = "3";
        Kalkulator peldany = new Kalkulator();
        int kapottEredmeny = peldany.osszead(szam1, szam2);
        //int elvartEredmeny = 5;
        //assertEquals(elvartEredmeny, kapottEredmeny);
        fail("kivételt várok...");
    }
}
