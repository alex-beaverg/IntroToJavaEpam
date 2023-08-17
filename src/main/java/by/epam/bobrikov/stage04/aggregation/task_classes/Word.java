package by.epam.bobrikov.stage04.aggregation.task_classes;

public class Word {
    private String word;

    public Word(String word, String type) {
        switch (type) {
            case "first" -> this.word = word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            case "last" -> this.word = word + ". ";
            case "title" -> this.word = word;
            case "single" -> this.word = word.substring(0, 1).toUpperCase() + word.substring(1) + ". ";
            default -> this.word = word + " ";
        }
    }

    @Override
    public String toString() {
        return word;
    }
}
