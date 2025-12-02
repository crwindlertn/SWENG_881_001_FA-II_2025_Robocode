import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // ---------- reverseString() ----------
    @Test
    void testReverseStringNormal() {
        assertEquals("cba", StringUtils.reverseString("abc"));
    }

    @Test
    void testReverseStringEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testReverseStringNull() {
        assertNull(StringUtils.reverseString(null));
    }

    // ---------- capitalizeString() ----------
    @Test
    void testCapitalizeNormal() {
        assertEquals("Hello", StringUtils.capitalizeString("hello"));
    }

    @Test
    void testCapitalizeAlreadyCapitalized() {
        assertEquals("Hello", StringUtils.capitalizeString("Hello"));
    }

    @Test
    void testCapitalizeAllCaps() {
        assertEquals("Hello", StringUtils.capitalizeString("HELLO"));
    }

    @Test
    void testCapitalizeEmpty() {
        assertEquals("", StringUtils.capitalizeString(""));
    }

    @Test
    void testCapitalizeNull() {
        assertNull(StringUtils.capitalizeString(null));
    }

    // ---------- countOccurrences() ----------
    @Test
    void testCountOccurrencesNormal() {
        assertEquals(3, StringUtils.countOccurrences("banana", 'a'));
    }

    @Test
    void testCountOccurrencesNone() {
        assertEquals(0, StringUtils.countOccurrences("banana", 'z'));
    }

    @Test
    void testCountOccurrencesEmpty() {
        assertEquals(0, StringUtils.countOccurrences("", 'a'));
    }

    @Test
    void testCountOccurrencesNull() {
        assertEquals(0, StringUtils.countOccurrences(null, 'a'));
    }
}
