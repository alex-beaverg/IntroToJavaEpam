package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры
 */
public class Task08 {
    public List<List<Integer>> taskCalculation(int[][] matrix, int column1, int column2) {

        /* Entering numbers of columns from keyboard is done using Scanner:
        import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        int column1 = scanner.nextInt();
        int column2 = scanner.nextInt();
        But we use function arguments! */

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int num1 = 0;
            int num2 = 0;
            List<Integer> subResult = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == column1) {
                    num1 = matrix[i][j];
                }
                if (j == column2) {
                    num2 = matrix[i][j];
                }
            }
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == column1) {
                    matrix[i][j] = num2;
                }
                if (j == column2) {
                    matrix[i][j] = num1;
                }
                subResult.add(matrix[i][j]);
            }
            result.add(subResult);
        }
        return result;
    }
}
