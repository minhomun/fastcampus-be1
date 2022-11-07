package me.day04.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 컴퓨터에게 완전한 랜덤값 생성이 불가능
        // 수식에 의해서 랜덤값 생성하게 됨
        // seed (컴퓨터 현재 시간) * (수식) = 수식 결과물 => 랜덤값 사용

        int randomValue = (int)(Math.random() * 100) + 1; // 기본적으로 import 된 클래스
        System.out.println("randomValue = " + randomValue);
        // seed 변경 불가
        // seed 기본값으로 설정
        // 0.0 <= Math.random() < 1.0
        // 0.0 <= Math.random() * 100 < 100.0
        // 0 <= (int)(Math.random() * 100) < 100
        // 1 <= (int)(Math.random() * 100) + 1 < 101
        // 1 <=  random <= 100 정수 랜덤값 생성하도록 만드려면 어떻게 해야할까요?


        // rsa, sha256, sha512 (password encode)
        Random random = new Random(); // 실무적으로 더 많이 사용
        random.setSeed(3);
        int randomValue2 = random.nextInt(100) + 1; // 1 <= random < 101
        System.out.println("randomValue2 = " + randomValue2);
        // seed 수정 가능
        // 동일 seed를 가지면 동일한 랜덤값 생성됨 (기본값: 컴퓨터 현재 시간)
    }
}
