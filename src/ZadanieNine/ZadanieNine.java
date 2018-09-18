package ZadanieNine;

import java.util.Arrays;
import java.util.Random;

public class ZadanieNine {
    public static void main(String[] args) {
        int[][] intArr = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                intArr[i][j] = (int) random.nextInt(22);
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                System.out.print(intArr[i][j]+" ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE, indexI = 0, indexJ = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                if (intArr[i][j] > max) {
                    max = intArr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("Максимальное значение =" + max);
        System.out.println("Индекс i =" + indexI);
        System.out.println("Индекс J = " + indexJ);
        if (indexI == 0) {
            System.out.println("Соседа сверху нет");
        } else {
            System.out.println("Соседа сверху" + intArr[indexI - 1][indexJ]);
        }
        if (indexI == intArr.length - 1) {
            System.out.println("Соседа сверху нет");
        } else {
            System.out.println("Соседа снизу" + intArr[indexI + 1][indexJ]);
        }
        if (indexJ == 0) {
            System.out.println("Соседа слева нет");
        } else {
            System.out.println("Соседа слева" + intArr[indexI][indexJ - 1]);
        }
        if (indexJ == intArr.length - 1) {
            System.out.println("Соседа справа нет");
        } else {
            System.out.println("Сосед справа" + intArr[indexI][indexJ + 1]);

        }
    }
}

