package ZadanieFour;

import java.util.Scanner;

public class ZadanieFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int a = scanner.nextInt();
        int b = 0;
        for (int i=0; i<3; i++){
            b+=a%10;
            a/=10;
        }
        System.out.println(b);



    }

}
