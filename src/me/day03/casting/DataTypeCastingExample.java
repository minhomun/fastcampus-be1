package me.day03.casting;

public class DataTypeCastingExample {
    public static void main(String[] args) {
        // type casting (명시적인 형변환)
        char ch = 'A';      // 2 byte (0 ~ 2^16-1)
        byte b = (byte) ch; // 1 byte (-128 ~ 127)

        // promotion (자동 형변환)
        byte byteValue = 10;
        int intValue = byteValue; // int <- byte
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;    // int <- char
        System.out.println(intValue); // charValue의 유니코드

        intValue = 500;
        long longValue = intValue; // long <- int
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue; // double <- int
        System.out.println(doubleValue);

        System.out.println("ch = " + ch);

        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////

        // 연산식에서 타입 변환
        byte byteValue1 = 10;
        byte byteValue2 = 20;
//        byte byteValue3 = byteValue1 + byteValue2; // 컴파일 에러
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
//        char charValue3 = charValue1 + charValue2; // 컴파일 에러
        int intValue2 = charValue1 + charValue2;
        System.out.println(intValue2); // 유니코드
        System.out.println((char)intValue2); // 출력문자

        int intValue3 = 10;
        int intValue4 = intValue3 / 4; // 몫
        System.out.println(intValue4);

        int intValue5 = 10;
        // int intValue6 = 10 / 4.0 // 컴파일 에러
        double doubleValue2 = intValue5 / 4.0;
        System.out.println(doubleValue2);

        int a = 10;
        a -= 3; // a = a - 3
        System.out.println(a); // 7
        System.out.println(a - 3); // 4
        System.out.println(a); // 7

        int a1 = 10;
        a1++; // a = a + 1
        System.out.println(a1); // 11
        ++a1; // a = a + 1
        System.out.println(a1); // 12

        int a2 = 10;
        int val = a2++;
        // val = a2;
        // a2++
        System.out.println(val); // 10
        System.out.println(a2); // 11
        int val2 = ++a2;
        // ++a2
        // val2 = a2;
        System.out.println(val2); // 12
        System.out.println(a2); // 12

    }
}
