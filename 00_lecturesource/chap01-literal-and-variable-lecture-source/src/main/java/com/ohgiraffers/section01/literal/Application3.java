package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {
        System.out.println("============== 두 개의 문자열 합치기 ==============");
        System.out.println(9 + 9); // 정수 18
        System.out.println("9" + 9); // 문자열 99
        System.out.println(9 + "9"); // 문자열 99
        System.out.println("9" + "9"); // 문자열 99

        System.out.println("============== 세 개의 문자열 합치기 ==============");
        // '+' 연산 방향은 왼쪽에서 오른쪽이다.
        // 사칙 연산 중 맨 앞의 값이 문자열이면 결과는 모두 문자열 형태로 변경된다.
        System.out.println(9 + 9 + "9"); // 1. 정수(9) + 정수(9) = 정수(18) 2. 정수(18) + 문자열(9) = 문자열(189)
        System.out.println(9 + "9" + 9); // 1. 9(정수) + 9(문자열) = 99(문자열) 2. 99(문자열) + 9(정수) = 999(문자열)
        System.out.println("9" + 9 + 9); // 1. 9(문자열) + 9(정수) = 99(문자열) 2. 99(문자열) + 9(정수) = 999(문자열)
        System.out.println("" + 9 + 9); // 1. _(빈 문자열) + 9(정수) = 9(문자열) 2. 9(문자열) + 9(정수) = 99(문자열)

        // 사칙 연산 중 괄호안에 있는 값을 우선적으로 연산한다.
        System.out.println("9" + (9 + 9)); // 1. (9[정수] + 9[정수]) = 18(정수) 2. 9(문자열) + 18(정수) = 918(문자열)

        // 10과 20의 사칙 연산 결과를 출력
        System.out.println("============== 10과 20의 사칙 연산 결과 1 ==============");
        System.out.println(10 + 20); // 30(정수)
        System.out.println(10 - 20); // -10(정수)
        System.out.println(10 * 20); // 200(정수)
        System.out.println(10 / 20); // 0(정수)
        System.out.println(10 % 20); // 10(정수)

        // 10과 20의 사칙 연산 결과와 어떤 사칙 연산을 하였는지 표시
        System.out.println("============== 10과 20의 사칙 연산 결과 2 ==============");
        System.out.println("10과 20의 합 : " + (10 + 20)); // 30(정수)
        System.out.println("10과 20의 차 : " + (10 - 20)); // -10(정수)
        System.out.println("10과 20의 곱 : " + (10 * 20)); // 200(정수)
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20)); // 0(정수)
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20)); // 10(정수)

        // System.err.println() 에러 출력
        System.err.println("10과 20의 합 : " + (10 + 20)); // 30(정수)
    }
}
