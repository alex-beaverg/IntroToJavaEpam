package by.epam.bobrikov.stage04.aggregation.task_classes;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> text;

    public Text() {
        this.text = new ArrayList<>();
    }

    public void addSentence(Sentence sentence) {
        text.add(sentence);
    }

    public void printTitle() {
        System.out.println("Title of text: " + text.get(0).toString().trim());
    }

    public void printText() {
        StringBuilder finalText = new StringBuilder();
        for (Sentence sentence: text) {
            finalText.append(sentence);
        }
        System.out.println(finalText);
    }

    @Override
    public String toString() {
        StringBuilder finalText = new StringBuilder();
        for (Sentence sentence: text) {
            finalText.append(sentence);
        }
        return finalText.toString();
    }
}
