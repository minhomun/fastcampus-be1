package me.day04.elseif;

public class ElseIfExample {
    public static void main(String[] args) {
        int score = 75;

        // 유효성 검증
        if (!(score >= 0 && score <= 100)) {
            System.out.println("유효하지 않은 데이터입니다.");
            return; // 메인 함수 종료
        }

        // 90점 이상: A
        // 80점 이상 ~ 90점 미만: B
        // 70점 이상 ~ 80점 미만: C
        // 60점 이상 ~ 70점 미만: D
        // 60점 미만: F
        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80) { // 80 <= score < 90
            System.out.println("B 학점");
        } else if (score >= 70) { // 70 <= score < 80
            System.out.println("C 학점");
        } else if (score >= 60) { // 60 <= score < 70
            System.out.println("D 학점");
        } else { // score < 60
            System.out.println("F 학점");
        }

        int age = 30;

        if (!(age >= 0 && age <= 100)) {
            System.out.println("유효하지 않은 데이터입니다.");
            return;
        }
        // 10세 미만: 아동
        // 20세 미만: 청소년
        // 40세 미만: 청년
        // 100세 이하: 실버세대
        if (age < 10) {
            System.out.println("아동");
        } else if (age < 20) {
            System.out.println("청소년");
        } else if (age < 40) {
            System.out.println("청년");
        } else {
            System.out.println("실버세대");
        }

    }
}
