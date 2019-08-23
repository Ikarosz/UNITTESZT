package kalkulatorprogram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KalkulatorProgramTest {
    
    public KalkulatorProgramTest() {
        System.out.println("cstr");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("@BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("@AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After");
    }

    /**
     * Test of main method, of class KalkulatorProgram.
     */
    @Test
    public void testMainUres() {
        System.out.println("mainUres");
        String[] args = null;
        KalkulatorProgram.main(args);
    }
    
    @Test
    public void testMainNev() {
        System.out.println("mainNev");
        String[] args = {"Péter", "Pál"};
        KalkulatorProgram.main(args);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testMainOsszeadHivas() {
        System.out.println("mainNev");
        String[] args = null;
        new Kalkulator().osszead("a", "2");
        fail("kivételnek kell jönnie");
    }
    
}
