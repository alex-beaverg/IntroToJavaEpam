package by.epam.bobrikov.stage04.aggregation.task_classes;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> sentence;

    public Sentence() {
        this.sentence = new ArrayList<>();
    }

    public void addWord(Word word) {
        sentence.add(word);
    }

    public void setAsTitle() {
        sentence.add(new Word("\n", "title"));
    }

    @Override
    public String toString() {
        StringBuilder finalSentence = new StringBuilder();
        for (Word word: sentence) {
            finalSentence.append(word);
        }
        return finalSentence.toString();
    }
}
