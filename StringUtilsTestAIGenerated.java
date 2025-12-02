import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("AI-Generated Tests for StringUtils – Original Data Set")
public class StringUtilsTestAIGenerated {

    // ---------------------------------------------------------------------
    @Nested
    @DisplayName("reverseString() Advanced Tests")
    class ReverseStringTests {

        @ParameterizedTest(name = "Reversing \"{0}\" should yield \"{1}\"")
        @CsvSource({
                "robot, tobor",
                "civic, civic",
                "'  tab ', ' bat  '",
                "abc123, 321cba",
                "'X Y Z', 'Z Y X'"
        })
        void testReverseVarious(String input, String expected) {
            assertEquals(expected, StringUtils.reverseString(input));
        }

        @Test
        @DisplayName("Reverse of a null input should return null")
        void testReverseNull() {
            assertNull(StringUtils.reverseString(null));
        }

        @Test
        @DisplayName("Reverse of an empty string remains empty")
        void testReverseEmpty() {
            assertEquals("", StringUtils.reverseString(""));
        }
    }

    // ---------------------------------------------------------------------
    @Nested
    @DisplayName("capitalizeString() Boundary and Formatting Tests")
    class CapitalizeStringTests {

        @ParameterizedTest(name = "Capitalize of \"{0}\" should yield \"{1}\"")
        @CsvSource({
                "pineapple, Pineapple",
                "LANTERN, Lantern",
                "mIdNiGhT, Midnight",
                "'java world', 'Java world'",
                "' spaces', ' spaces'"
        })
        void testCapitalizeVarious(String input, String expected) {
            assertEquals(expected, StringUtils.capitalizeString(input));
        }

        @Test
        @DisplayName("Capitalize of null returns null")
        void testCapitalizeNull() {
            assertNull(StringUtils.capitalizeString(null));
        }

        @Test
        @DisplayName("Capitalize of empty string returns empty string")
        void testCapitalizeEmpty() {
            assertEquals("", StringUtils.capitalizeString(""));
        }
    }

    // ---------------------------------------------------------------------
    @Nested
    @DisplayName("countOccurrences() Expanded Tests")
    class CountOccurrencesTests {

        @ParameterizedTest(name = "\"{0}\" contains {2} occurrence(s) of '{1}'")
        @CsvSource({
                "raindrop, r, 1",
                "committee, t, 2",
                "bookkeeper, e, 3",
                "'  spaced  ',  , 2",       // whitespace character
                "numbers123321, 2, 2"
        })
        void testCountOccurrencesVarious(String input, char target, int expected) {
            assertEquals(expected, StringUtils.countOccurrences(input, target));
        }

        @Test
        @DisplayName("CountOccurrences returns 0 when input is null")
        void testCountOccurrencesNull() {
            assertEquals(0, StringUtils.countOccurrences(null, 'q'));
        }

        @Test
        @DisplayName("Counts special character occurrences correctly")
        void testCountOccurrencesSpecialChar() {
            String text = "$$$profit$$$";
            assertEquals(6, StringUtils.countOccurrences(text, '$'));
        }

        @Test
        @DisplayName("Counts digit characters accurately")
        void testCountOccurrencesDigit() {
            String text = "20252025";
            assertEquals(4, StringUtils.countOccurrences(text, '2'));
        }
    }
}
