package ptr.workshop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ScrewDriverTestSuite {

    ScrewDriver sd = new ScrewDriver("GreenOne", HeadType.FlatHead, 100, 10,
            LocalDate.now(), LocalDate.of(2020, 05, 20));

    @Test
    public void shouldReturnScrewDriver() {
        //given & when
        String sdName = sd.getName();
        String ht = sd.getHeadType().name();
        //then
        assertEquals("FlatHead", ht);
        assertEquals("GreenOne", sdName);
    }

    @Test
    public void shouldReturnCorrectLengthAndDiameter() {
        assertEquals(10, sd.getDriverDiameter());
        assertEquals(100, sd.getDriverLength());
    }

    @ParameterizedTest
    @CsvSource(value = {"2.5, 0-1", "3,2-4", "3.5,5-9", "5,10-16", "6,18-24", "8,5/8 & 3/4"})
    public void shouldReturnCorrectDiameterScrewDriver(double number, String expSizes) {
        //given & when
        String fits = sd.checkScrewFit(number);
        //Then
        assertEquals(expSizes, fits);

    }

    @Test
    public void shouldReturnWrongSize() {
        //given & when
        String fits = sd.checkScrewFit(2.7);
        //then
        assertEquals("Not valid Phillips tip size: please provide 2.5, 3, 3.5, 5, 6, 8", fits);
    }

    @Test
    public void shouldIncreaseDaysInUsage() {
        //given & when
        sd.useScrewDriverDay(7);
        int daysU = sd.getDaysInUsage();
        //then
        assertEquals(7, daysU);
    }

    @Test
    public void shouldAddComment() {
        //given & when
        sd.setComment("Good Tool");
        //then
        assertEquals("Good Tool", sd.getComment());
    }

    @Test
    public void shouldSetGoodFalse() {
        //given & when
        sd.setGood(false);
        //then
        assertFalse(sd.isGood());
    }

}