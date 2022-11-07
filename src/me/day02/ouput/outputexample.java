package me.day02.ouput;

import java.sql.SQLOutput;

public class outputexample {
    public static void main(String[] args) {
        int month =12;
        int day = 31;

        System.out.printf("%2d월 %2d일\n", month, day);
        System.out.printf("%x월 %x일\n", month, day);
        System.out.printf("%o월 %o일\n", month, day);

        final double PI = 3.141592;
        System.out.printf("%.3f\n", PI);
        }
    }

