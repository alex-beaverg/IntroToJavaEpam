package by.epam.bobrikov.stage03.regex;

import java.util.Arrays;

public class RegexActions {
    public void taskActions() {
        System.out.println("Regex actions:");

        // Task 01:
        System.out.println("Task 01-1: \n" + new Task01()
                .taskCalculation("Microsoft word is the best word in the world. It's great! \n" +
                        "Good evening. What do you think about it? Oh, hello! \n" +
                        "I miss you. It was unforgettable! See you! Bye! \n" +
                        "Good bye!", 1));
        System.out.println();
        System.out.println("Task 01-2: \n" + new Task01()
                .taskCalculation("Microsoft word is the best word in the world. It's great! \n" +
                        "Good evening. What do you think about it? Oh, hello! \n" +
                        "I miss you. It was unforgettable! See you! Bye! \n" +
                        "Good bye!", 2));
        System.out.println();
        System.out.println("Task 01-3: \n" + new Task01()
                .taskCalculation("Microsoft word is the best word in the world. It's great! \n" +
                        "Good evening. What do you think about it? Oh, hello! \n" +
                        "I miss you. It was unforgettable! See you! Bye! \n" +
                        "Good bye!", "o"));
        System.out.println();

        // Task 02:
        System.out.println("Task 02: " + Arrays.toString(new Task02()
                .taskCalculation("<notes>\n" +
                        "  <note id = \"1\">\n" +
                        "    <to>Вася</to>\n" +
                        "    <from>Света</from>\n" +
                        "    <heading>Напоминание</heading>\n" +
                        "    <body>Позвони мне завтра!</body>\n" +
                        "  </note>\n" +
                        "  <note id = \"2\">\n" +
                        "    <to>Петя</to>\n" +
                        "    <from>Маша</from>\n" +
                        "    <heading>Важное напоминание</heading>\n" +
                        "    <body/>\n" +
                        "  </note>\n" +
                        "</notes>")));
    }
}
