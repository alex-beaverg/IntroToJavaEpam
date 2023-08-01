package by.epam.bobrikov.stage01.cycles;

import java.util.HashMap;
import java.util.Map;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 */
public class Task06 {
    public Map<Character, Integer> taskCalculation(char[] array) {
        Map<Character, Integer> symbols = new HashMap<>();
        for (int i = array[0]; i <= array[1]; i++) {
            symbols.put((char)i, i);
        }
        return symbols;
    }
}
