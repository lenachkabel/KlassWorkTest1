package ZadanieNine;

import java.util.Arrays;
import java.util.Random;

public class ZadanieNine {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) Math.round(Math.random() * 9);
                System.out.println(Arrays.toString(array));

              //  int temp = array[1];
               // array[2] = array[2];
               // array[2] = temp;
            }
            System.out.println(array[1]);
            System.out.println(array[2]);
        }

    }
}
