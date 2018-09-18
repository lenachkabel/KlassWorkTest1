package ZadanieSix;

public class adanieSix {
    public static void main(String[] args) {
        String start = "13:12:11";
        String finish = "11:14:16";
        String [] arrStart = start.split(":");
        String [] arrFinish = finish.split(":");
        int []arrResalt = new int[arrStart.length];
        int startTemp, finishTemp;
        for (int i= 0; i<arrStart.length; i++){
            startTemp = Integer.parseInt(arrStart[i]);
            finishTemp = Integer.parseInt(arrFinish[i]);
            if (finishTemp-startTemp>=0) {
                arrResalt[i] = finishTemp + 24 - startTemp;
            } else {
                if (i !=0) {
                    arrResalt[i] = finishTemp + 60 - startTemp;
                }else {
                    arrResalt[i] = finishTemp + 24 - startTemp;
                }
            }

        }
        System.out.println("Результат" +arrResalt[0]+ ":"+arrResalt[1]+ ":" + arrResalt[2]);

    }
}
