package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Магическим квадратом порядка n называется квадратная матрица размера (n * n), составленная из
 * чисел 1, 2, 3, ..., n**2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны
 * между собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 *          6 1 8
 *          7 5 3
 *          2 9 4
 */
public class Task16 {
    public List<List<Integer>> taskCalculation(int numN) {
        int lineSum = lineSum(numN);
        List<Integer> numberList = numberList(numN);
        List<List<Integer>> linesWithNumbers = linesWithNumbers(numN, lineSum, numberList);
        while (!isColumnsAndDiagonalsEqual(numN, lineSum, linesWithNumbers)) {
            numberList = numberList(numN);
            linesWithNumbers = linesWithNumbers(numN, lineSum, numberList);
        }

        return linesWithNumbers;
    }

    public int lineSum(int numN) {
        int result = 0;
        for (int i = 1; i <= Math.pow(numN, 2); i++) {
            result = result + i;
        }
        return result / numN;
    }

    public List<Integer> numberList(int numN) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= Math.pow(numN, 2); i++) {
            numberList.add(i);
        }
        return numberList;
    }

    public List<List<Integer>> linesWithNumbers(int numN, int lineSum, List<Integer> numberList) {
        Random random = new Random();
        List<List<Integer>> result = new ArrayList<>();
        while (numberList.size() > 0) {
            List<Integer> tempSmallList = new ArrayList<>();
            tempSmallList.add(numberList.remove(random.nextInt(numberList.size())));
            while (true) {
                while (tempSmallList.size() < numN) {
                    tempSmallList.add(numberList.remove(random.nextInt(numberList.size())));
                }
                if (isRowEqual(lineSum, tempSmallList)) {
                    if (numN == 3 && tempSmallList.contains(2) && tempSmallList.contains(5) &&
                            tempSmallList.contains(8) || numN == 3 && tempSmallList.contains(4) &&
                            tempSmallList.contains(5) && tempSmallList.contains(6)) {
                        while (tempSmallList.size() > 1) {
                            numberList.add(tempSmallList.remove(tempSmallList.size() - 1));
                        }
                    } else {
                        result.add(tempSmallList);
                        break;
                    }
                } else {
                    while (tempSmallList.size() > 1) {
                        numberList.add(tempSmallList.remove(tempSmallList.size() - 1));
                    }
                }
            }
        }

        return result;
    }

    public boolean isRowEqual(int lineSum, List<Integer> list) {
        int x = 0;
        for (int element: list) {
            x += element;
        }
        return x == lineSum;
    }

    public boolean isColumnsAndDiagonalsEqual(int numN, int lineSum, List<List<Integer>> list) {
        int z1 = 0;
        int z2 = 0;
        for (int i = 0; i < numN; i++) {
            int y = 0;
            for (int j = 0; j < numN; j++) {
                y += list.get(j).get(i);
                if (i == j) {
                    z1 += list.get(i).get(j);
                }
                if (i + j == list.size() - 1) {
                    z2 += list.get(i).get(j);
                }
            }
            if (y != lineSum) {
                return false;
            }
        }
        return z1 == lineSum && z2 == lineSum;
    }
}
