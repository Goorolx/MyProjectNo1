package ptr.workshop;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ScrewDriverTestSuite {

    ScrewDriver sd = new ScrewDriver("GreenOne",HeadType.FlatHead,100,10,
            LocalDate.now(),LocalDate.of(2020,05,20));

    @Test
    public void shouldReturnScrewDriver(){
        String sdName = sd.getName();
        String ht = sd.getHeadType().name();

        assertEquals("FlatHead",ht);
        assertEquals("GreenOne",sdName);
    }

}