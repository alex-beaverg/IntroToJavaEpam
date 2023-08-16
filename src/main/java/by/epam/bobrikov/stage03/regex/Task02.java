package by.epam.bobrikov.stage03.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 *   <note id = "1">
 *     <to>Вася</to>
 *     <from>Света</from>
 *     <heading>Напоминание</heading>
 *     <body>Позвони мне завтра!</body>
 *   </note>
 *   <note id = "2">
 *     <to>Петя</to>
 *     <from>Маша</from>
 *     <heading>Важное напоминание</heading>
 *     <body/>
 *   </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
 * тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной
 * задачи нельзя
 */
public class Task02 {
    public String[] taskCalculation(String text) {
        Pattern SPLIT = Pattern.compile("\\n\\s*");
        String[] lines = SPLIT.split(text);

        Pattern OPEN_WO_ARG = Pattern.compile("<\\w+?>");
        Pattern OPEN_W_ARG = Pattern.compile("<\\w+? [\\w\\D]*?>");
        Pattern ARG = Pattern.compile("\\w+\\s=\\s\"\\d+\"");
        Pattern BODY = Pattern.compile(">([\\w\\D]+?)<");
        Pattern OPEN_WO_BODY = Pattern.compile("<\\w+?/>");
        Pattern CLOSE = Pattern.compile("</\\w+?>");

        List<String> xmlDescription = new ArrayList<>();

        for (String line: lines) {
            Matcher matcherOpenWithoutArg = OPEN_WO_ARG.matcher(line);
            Matcher matcherOpenWithArg = OPEN_W_ARG.matcher(line);
            Matcher matcherArg = ARG.matcher(line);
            Matcher matcherBody = BODY.matcher(line);
            Matcher matcherOpenWithoutBody = OPEN_WO_BODY.matcher(line);
            Matcher matcherClose = CLOSE.matcher(line);
            if (matcherOpenWithoutArg.find()) {
                xmlDescription.add("\nOpening tag without argument: " + matcherOpenWithoutArg.group());
            }
            if (matcherOpenWithArg.find()) {
                xmlDescription.add("\nOpening tag with argument: " + matcherOpenWithArg.group());
            }
            if (matcherArg.find()) {
                xmlDescription.add("\nArgument: " + matcherArg.group());
            }
            if (matcherBody.find()) {
                xmlDescription.add("\nBody: " + matcherBody.group(1));
            }
            if (matcherOpenWithoutBody.find()) {
                xmlDescription.add("\nOpening tag without body: " + matcherOpenWithoutBody.group());
            }
            if (matcherClose.find()) {
                xmlDescription.add("\nClosing tag: " + matcherClose.group());
            }
        }
        return xmlDescription.toArray(new String[0]);
    }
}
