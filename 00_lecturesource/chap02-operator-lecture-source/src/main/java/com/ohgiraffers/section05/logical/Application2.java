package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 논리 연산자의 우선순위와 활용
         * 논리 and 연산자와 논리 or 연산자의 우선순위
         * && : 11순위
         * || : 12순위
         *
         * 논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높다.
         */

        /* 1부터 100사이의 값인지 확인 */

        // 1 <= 숫자 <= 100 이렇게는 사용하지 못 한다.
        // --> 변수 >= 1 && 변수 <= 100 이렇게 사용한다.
        int num1 = 55;
        System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 155;
        System.out.println("1부터 100사이인지 확인 : " + (num2 >= 1 && num2 <= 100));

        /* 영어 대문자인지 화인 */
        // 영어 소문자 a-z 값 : 97-122 (ASCII CODE)
        // 영어 대문자 A-Z 값 : 65-90 (ASCII CODE)
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
//        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 65 && ch1 <= 90));

        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));
//        System.out.println("영어 대문자인지 확인 : " + (ch2 >= 65 && ch2 <= 90));

        /* 대소문자 상관없이 영문자 y인지 확인 */
        char ch3 = 'Y';
        System.out.println("대소문자 상관 없이 영문자 y인지 확인 : " + (ch3== 'y' || ch3 == 'Y'));

        char ch4 = 'y';
        System.out.println("대소문자 상관 없이 영문자 y인지 확인 : " + (ch4== 'y' || ch4 == 'Y'));

        /* 영문자인지 확인 */
        char ch5 = 'F';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
//        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));
    }
}
