package ru.netology.sqr.limits;

import ru.netology.sqr.limits.SQRService;

public class Main {

    public static void main(String[] args) {
        int leftlimit=9802;
        int rightlimit = 10000;
        SQRService sqr = new SQRService();
        int Y= sqr.calcSQR(leftlimit, rightlimit);
        System.out.println(Y);







    }
}