package ptr.workshop;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrewTestSuite {

    public ScrewTestSuite() throws Exception {
    }
    //Workshop izbecka = new Workshop("Izbecka");
    Screw s = new Screw("a1", HeadType.FlatHead, 5.5, 0.5);


    //Basic Tests to check main functionalities
    @Test
    public void shouldAddNewScrewWithCorrectParameters() throws Exception {
        //given
        Screw s1 = new Screw("a12", HeadType.Phillips, 5.5, 0.5);
        //when
        String s1name = s1.getHeadType().name();
        //then
        assertNotEquals("FlatHead", s1name);
        assertEquals("Phillips", s1name);
        assertEquals(5.5, s1.getScrewLength());
        assertEquals(0.5, s1.getScrewDiameter());
        assertEquals("a12",s1.getName());
    }
    @Test void shouldNotAddScrewWithZeroOrNegativeLength(){
        assertThrows(WrongInputException.class,
                ()->{Screw s1 = new Screw("a12", HeadType.Phillips, -5.5, 0.8);});
        assertThrows(WrongInputException.class,
                ()->{Screw s1 = new Screw("a12", HeadType.Phillips, 5.5, -0.8);});
    }

    @Test
    public void shouldReturnCorrectScrewsDiameter() {
        String sName = s.getHeadType().name();
        System.out.println(sName);
    }

    @BeforeAll
    public static void testingStartMessage() {
        System.out.println("Starting Tests");
    }

    @AfterAll
    public static void testingEndMessage(){
        System.out.println("Testing is done");
    }
}