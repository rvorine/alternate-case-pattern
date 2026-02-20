public class AlternateCase {

    public static String alternateCase(String input) {
        boolean makeUpper = true;
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(makeUpper ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
                makeUpper = !makeUpper;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(alternateCase("instagram"));   // InStAgRaM
        System.out.println(alternateCase("hello world")); // HeLlO wOrLd
        System.out.println(alternateCase("abc123def"));   // AbC123DeF
    }
}
