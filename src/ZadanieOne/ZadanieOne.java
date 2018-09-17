package ZadanieOne;

import java.util.Scanner;

public class ZadanieOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину ребра куба");
        double a;
        double b;
        double v = scanner.nextDouble();
        double s = scanner.nextDouble();
        a = v*v*v;
        b = 6*(s*s);
        System.out.println("Объем куба" +a);
        System.out.println("Площадь боковой поверхности куба равна" +b);


    }
}
