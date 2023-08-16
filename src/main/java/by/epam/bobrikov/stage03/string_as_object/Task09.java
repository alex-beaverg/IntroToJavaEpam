package by.epam.bobrikov.stage03.string_as_object;

/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только
 * английские буквы
 */
public class Task09 {
    public String[] taskCalculation(String text) {
        int small = 0;
        int big = 0;
        for (char c: text.toCharArray()) {
            if (c > 96 && c < 123) {
                small++;
            } else if (c > 64 && c < 91) {
                big++;
            }
        }
        return new String[]{"Small: " + small, "Big: " + big};
    }
}
