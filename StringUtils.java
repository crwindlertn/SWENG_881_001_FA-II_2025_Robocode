public class StringUtils {public static String reverseString(String input) {
    if (input == null) {
        return null;
    }
    return new StringBuilder(input).reverse().toString();
}

    public static String capitalizeString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public static int countOccurrences(String input, char target) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
