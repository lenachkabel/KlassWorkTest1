package ZadanieThree;

import java.util.Scanner;

public class ZadanieThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите валюту");
        String str = scanner.next();
        switch (str) {
            case "euro": {
            }
            System.out.println("2.4");
            break;

            case "$": {
            }
            System.out.println("2.2");
            break;

            case "rub": {
                System.out.println("0,0315");
                break;
            }


        }
    }
}


