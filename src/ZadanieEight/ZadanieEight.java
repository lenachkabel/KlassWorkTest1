package ZadanieEight;

import java.util.Scanner;

public class ZadanieEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" +");
        int resalt =0;
        for (String tempWord : words){
            if (tempWord.length()>resalt){
                resalt = tempWord.length();
            }
        }
        System.out.println("Самое длинное слово" + resalt+"символов");

    }
}
