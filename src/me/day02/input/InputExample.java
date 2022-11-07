package me.day02.input;

import java.util.Scanner;

public class inputexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String gender;
        double height;
        char alphabet;

        System.out.print("이름 입력");
        name = scanner.nextLine();


        System.out.print("나이 입력");
        age=scanner.nextInt();

        System.out.print("성별 입력");
        gender = scanner.next();

        System.out.print("키 입력");
        height = scanner.nextDouble();
        alphabet = scanner.next().charAt(0);
        System.out.print("알파벳 입력");


        //char ch = (char) 100000;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("height = " + height);
        System.out.println("alphbet = " + alphabet);
    }
}
