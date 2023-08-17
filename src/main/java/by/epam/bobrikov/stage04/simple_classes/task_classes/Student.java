package by.epam.bobrikov.stage04.simple_classes.task_classes;

public class Student {
    private final String surnameAndInitials;
    private final int groupNumber;
    private final int[] progress;

    public Student(String surnameAndInitials, int groupNumber, int[] progress) {
        this.surnameAndInitials = surnameAndInitials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public boolean isGoodProgress() {
        for (int grade: progress) {
            if (grade < 9) {
                return false;
            }
        }
        return true;
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}
