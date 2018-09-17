package ZadanieFive;

import java.util.Arrays;
import java.util.Random;

public class ZadanieFive {
    public static void main(String[] args) {
        int[][][] array = new int[5][10][15];
        Random random = new Random();
        int min = 0;
        int max;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++){
                    array [i][j][k] = random.nextInt(50);
                    array[i][j][k] = ((int) Math.round(Math.random() * 50));

                    System.out.println(array[i][j][k]);
                }
            }}




        System.out.println();



    }

}
