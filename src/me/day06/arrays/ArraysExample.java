package me.day06.arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int score1 = 100;
        int score2 = 50;
        int score3 = 40;
        int score4 = 50;
        int score5 = 80;

        int[] scores1 = new int[5]; // 동적할당 (실행 시에 힙의 사이즈가 정해짐)
        scores1[0] = 100;
        scores1[1] = 50;
        scores1[2] = 40;
        scores1[3] = 50;
        scores1[4] = 80;
        //grades[5] = 90; // ArrayIndexOutOfBoundsException (컴파일 오류 X, 실행 오류 O)


        // add(new int[] {100, 50, 40, 50, 80}) (O)
        // add({100, 50, 40, 50, 80}) (X)

        int[] scores2;
        scores2 = new int[] {100, 50, 40, 50, 80};

        for (int i = 0; i < scores2.length; i++) { // for-i

        }

        for (int score: scores2) { // for-each
            // i가 필요 없을 때
            // 인덱스 정보가 필요 없을 때
        }

        int[] scores3 = {100, 50, 40, 50, 80}; // 배열의 크기는 5, 인덱스 0 ~ 4
        // 배열: 동일한 데이터 타입 (*)의 데이터를 하나의 변수 (***)로 관리하기 위해서 만듦
        //      인덱스를 통해 원소를 접근할 수 있음 (인덱싱)
        // 인덱스: 0부터 시작 (메모리상 배열의 첫번째 원소 주소가 배열에 이름에 들어가있기 때문)
        // 원소 접근하는 방법: 배열 첫번째 원소 주소 + (인덱스 * (데이터 타입))
        // 0: 200+4*0 = 200
        // 1: 200+4*1 = 204
        // 2: 200+4*2 = 208
        // 3: 200+4*3 = 212
        // 4: 200+4*4 = 216
        for (int i = 0; i < scores3.length; i++) {
            System.out.println(scores3[i]);
        }
    }
}
