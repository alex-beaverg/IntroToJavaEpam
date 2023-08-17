package by.epam.bobrikov.stage04.aggregation;

import by.epam.bobrikov.stage04.aggregation.task_classes.Sentence;
import by.epam.bobrikov.stage04.aggregation.task_classes.Text;
import by.epam.bobrikov.stage04.aggregation.task_classes.Word;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль
 * текст, вывести заголовок текста
 */
public class Task01 {
    public void taskCalculation() {
        Word word1_1 = new Word("about", "first");
        Word word2_1 = new Word("me", "last");
        Sentence sentence1 = new Sentence();
        sentence1.addWord(word1_1);
        sentence1.addWord(word2_1);
        sentence1.setAsTitle();

        Word word1_2 = new Word("hello", "single");
        Sentence sentence2 = new Sentence();
        sentence2.addWord(word1_2);

        Word word1_3 = new Word("my", "first");
        Word word2_3 = new Word("name", "");
        Word word3_3 = new Word("is", "");
        Word word4_3 = new Word("Alexey", "last");
        Sentence sentence3 = new Sentence();
        sentence3.addWord(word1_3);
        sentence3.addWord(word2_3);
        sentence3.addWord(word3_3);
        sentence3.addWord(word4_3);

        Word word1_4 = new Word("i", "first");
        Word word2_4 = new Word("was", "");
        Word word3_4 = new Word("born", "");
        Word word4_4 = new Word("in", "");
        Word word5_4 = new Word("Minsk", "last");
        Sentence sentence4 = new Sentence();
        sentence4.addWord(word1_4);
        sentence4.addWord(word2_4);
        sentence4.addWord(word3_4);
        sentence4.addWord(word4_4);
        sentence4.addWord(word5_4);

        Text text = new Text();
        text.addSentence(sentence1);
        text.addSentence(sentence2);
        text.addSentence(sentence3);
        text.addSentence(sentence4);

        text.printText();
        text.printTitle();
    }
}
