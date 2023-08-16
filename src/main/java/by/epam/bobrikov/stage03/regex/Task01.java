package by.epam.bobrikov.stage03.regex;

import java.util.regex.Pattern;

/**
 * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае
 * равенства – по алфавиту
 */
public class Task01 {
    public String taskCalculation(String text, int action) {
        return switch (action) {
            case (1) -> action1(text);
            case (2) -> action2(text);
            default -> text;
        };
    }

    public String taskCalculation(String text, String symbol) {
        return action3(text, symbol);
    }

    public String action1(String text) {
        String[] paragraphs = text.split("\n");
        Pattern SENTENCES = Pattern.compile("[.?!]");
        int j;
        for (int i = 1; i < paragraphs.length; i++) {
            int x = (int) SENTENCES.matcher(paragraphs[i]).results().count();
            String xX = paragraphs[i];
            for (j = i; j > 0 && x < (int) SENTENCES.matcher(paragraphs[j - 1]).results().count(); j--) {
                paragraphs[j] = paragraphs[j - 1];
            }
            paragraphs[j] = xX;
        }
        StringBuilder result = new StringBuilder();
        for (String str: paragraphs) {
            result.append(str).append("\n");
        }
        return result.toString().trim();
    }

    public String action2(String text) {
        String[] paragraphs = text.split("\n");
        Pattern SENTENCES = Pattern.compile("[.?!]");
        StringBuilder result = new StringBuilder();
        for (String paragraph : paragraphs) {
            String[] sentences = paragraph.split("[.?!]");
            StringBuilder resultSentences = new StringBuilder();
            for (int j = 0; j < (int) SENTENCES.matcher(paragraph).results().count(); j++) {
                String[] words = sentences[j].trim().split(" ");
                int k;
                for (int m = 1; m < words.length; m++) {
                    int x = words[m].toCharArray().length;
                    String xX = words[m];
                    for (k = m; k > 0 && x < words[k - 1].toCharArray().length; k--) {
                        words[k] = words[k - 1];
                    }
                    words[k] = xX;
                }
                for (String word : words) {
                    resultSentences.append(word).append(" ");
                }
                resultSentences = new StringBuilder(resultSentences.toString().trim() + ". ");
            }
            result.append(resultSentences.toString().trim()).append("\n");
        }
        return result.toString().trim();
    }

    public String action3(String text, String symbol) {
        String[] paragraphs = text.split("\n");
        Pattern SENTENCES = Pattern.compile("[.?!]");
        StringBuilder result = new StringBuilder();
        for (String paragraph : paragraphs) {
            String[] sentences = paragraph.split("[.?!]");
            StringBuilder resultSentences = new StringBuilder();
            for (int j = 0; j < (int) SENTENCES.matcher(paragraph).results().count(); j++) {
                String[] words = sentences[j].trim().split(" ");
                Pattern SYMBOL = Pattern.compile('[' + symbol + ']');
                int k;
                for (int m = 1; m < words.length; m++) {
                    int x = (int) SYMBOL.matcher(words[m]).results().count();
                    String xX = words[m];
                    for (k = m; k > 0 && x > (int) SYMBOL.matcher(words[k - 1]).results().count() ||
                            k > 0 && x == (int) SYMBOL.matcher(words[k - 1]).results().count() &&
                                    xX.compareTo(words[k - 1]) < 0; k--) {
                        words[k] = words[k - 1];
                    }
                    words[k] = xX;
                }
                for (String word : words) {
                    resultSentences.append(word).append(" ");
                }
                resultSentences = new StringBuilder(resultSentences.toString().trim() + ". ");
            }
            result.append(resultSentences.toString().trim()).append("\n");
        }
        return result.toString().trim();
    }
}
