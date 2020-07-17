package ptr.workshop;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrewTestSuite {

    //Workshop izbecka = new Workshop("Izbecka");
    Screw s = new Screw("a1", HeadType.FlatHead, 5.5, 0.5);

    //Basic Tests to check main functionalities
    @Test
    public void shouldAddNewScrew() {
        //given
        Screw s1 = new Screw("a12", HeadType.Phillips, 5.5, 0.5);
        //when
        String s1name = s1.getHeadType().name();
        //then
        assertNotEquals("FlatHead",s1name);
        assertEquals("Phillips",s1name);

    }

    @Test
    public void shouldReturnCorrectScrewsDiameter(){

        String sName = s.getHeadType().name();

        System.out.println(sName);
        //then
       // assertEquals();
        //assertTrue(izbecka.getScrews.notEmpty)

    }


@BeforeAll
        public static void testingStartMessage(){
    System.out.println("Starting Tests");
}


}