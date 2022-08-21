package ru.netology.sqr.limits;

public class SQRService {

    public int calcSQR(int leftlimit, int rightlimit) {
        int x = 0;
        int i = 0;

        for (i = Math.max(10, (int) Math.sqrt(leftlimit)); i < Math.min(99, (int) (Math.sqrt(rightlimit)) + 1); i++) {
            x++;
        }
        return x;

    }


}
