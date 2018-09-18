package ZadanieTwo;

import java.util.Scanner;

public class ZadanieTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resalt;
        for (int a = 1; a < 10; a++) {
            for (int j=1; j < 10; j++) {
                System.out.println("Введите значение" +
                        "произведения чисел " + a + "и" + j);
                resalt = scanner.nextInt();
                if (resalt == a * j) {
                    System.out.println("Угадали");
                } else {
                    System.out.println("Не угадали");
                }


            }
        }
    }
}

