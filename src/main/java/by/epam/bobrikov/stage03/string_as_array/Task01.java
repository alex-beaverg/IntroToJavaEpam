package by.epam.bobrikov.stage03.string_as_array;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */
public class Task01 {
    public String[] taskCalculation(String[] variables) {
        for (int i = 0; i < variables.length; i++) {
            variables[i] = editCase(variables[i]);
        }
        return variables;
    }

    public String editCase(String variable) {
        char[] varChars = variable.toCharArray();
        String newVar = "";
        for (char varChar : varChars) {
            if (String.valueOf(varChar).equals(String.valueOf(varChar).toUpperCase())) {
                newVar += "_" + String.valueOf(varChar).toLowerCase();
            } else {
                newVar += varChar;
            }
        }
        return newVar;
    }
}
