package by.epam.bobrikov.stage04.simple_classes.task_classes;

public class Train {
    private final String destination;
    private final int trainNumber;
    private final String time;

    public Train(String destination, int trainNumber, String time) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.time = time;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }
}
