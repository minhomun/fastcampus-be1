package me.day05.nested;

public class NestedLoopExample {
    public static void main(String[] args) {
        // 구구단 출력 (2단 ~ 9단)
        for (int i = 2; i < 10; i++) { // 2, 3, 4
            for (int j = 1; j < 10; j++) { // 1 ~ 9, 1 ~ 9, 1 ~ 9
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
        System.out.println();

        int i = 2;
        while (i < 10) {
            int j = 1;
            while (j < 10) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
                j++;
            }
            System.out.println();
            i++;
        }


//        // (1, 1), (2, 2), (3, 3) .... (9, 9)
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (i == j) {
//                    System.out.printf("(%d, %d)\n", i, j);
//                }
//            }
//        }
//        System.out.println();
//
//        int j = 1;
//        for (int i = 1; i < 10; i++) {
//            System.out.printf("(%d, %d)\n", i, j);
//            j++;
//        }

    }
}
