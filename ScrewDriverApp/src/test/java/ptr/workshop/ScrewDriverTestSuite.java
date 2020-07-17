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
        String sdName = sd.getName();
        String ht = sd.getHeadType().name();

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
        String fits = sd.checkScrewFit(number);

        //Then
        assertEquals(expSizes, fits);
    }

    @Test
    public void shouldIncreaseDaysInUsage() {
        sd.useScrewDriverDay(7);
        LocalDate daysU = sd.getDaysInUsage();

        assertEquals(LocalDate.now().plusDays(7), daysU);
    }

    @Test
    public void shouldAddComment() {
        sd.setComment("Good Tool");

        assertEquals("Good Tool", sd.getComment());
    }

    @Test
    public void shouldSetGoodFalse(){
        sd.setGood(false);

        assertFalse(sd.isGood());
    }

}