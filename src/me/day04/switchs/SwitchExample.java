package me.day04.switchs;

public class SwitchExample {
    public static void main(String[] args) {
        int month = 1;
        int totalDays = 0;

        switch(month) { // 정수, 문자, 문자열
            // if (month == 1) || (month == 3) || (month == 5) || (month == 7) ........
            // month == 부분을 switch case문에서는 생략가능 (가독성 ↑)
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                totalDays = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                totalDays = 30;
                break;

            case 2:
                totalDays = 28;
                break;
        } // switch 문장 끝

        System.out.printf("%d월의 총 일수는 %d일 입니다\n", month, totalDays);

        ////////////////////////////////////////////////////////////////
        // q Q (case-insensitive)
        String grade = "B".toLowerCase(); // 소문자를 기준으로 비교

        switch(grade) {
//            case "A":
            case "a":
                System.out.println("우수 회원");
                break;
//            case "B":
            case "b":
                System.out.println("일반 회원");
                break;
            default:
                System.out.println("손님");
        }
    }
}
