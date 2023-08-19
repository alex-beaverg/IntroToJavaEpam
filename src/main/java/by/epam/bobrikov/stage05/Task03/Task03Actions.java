package by.epam.bobrikov.stage05.Task03;

/**
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных
 * и праздничных днях
 */
public class Task03Actions {
    public void taskCalculation(){
        Calendar calendar = new Calendar();
        calendar.new Holiday("1 Jan", "New Year's Eve");
        calendar.new Holiday("7 Jan", "Christmas");
        calendar.new Holiday("14 Feb", "St. Valentine's day");
        calendar.new Holiday("23 Feb", "Military day");
        calendar.new Holiday("8 Mar", "World women's day");
        calendar.new Holiday("1 Apr", "Fool's day");
        calendar.printCalendar();
    }
}
