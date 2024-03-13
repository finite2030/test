package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        /*
         * [switch문 표현식]
         * switch(비교할변수) {
         *    case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
         *    case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
         *    default : case에 모두 해당하지 않는 경우 실행할 구문; break;
         * }
         */

        /*
         * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다.
         * 따라서 일부 호환이 가능하다.
         * 하지만, switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
         * 실수와 논리는 비교할 수 없다.
         * 또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다.
         * case절에는 변수를 사용하지 못한다. (값만 비교 가능)
         * 또한, 문자열 비교는 jdk 1.7 이상부터 가능하다.
         */

        /* 정수 두 개와 연산 기호 입력 */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("first = " + first);

        System.out.print("두 번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.println("second = " + second);

        System.out.print("연산 기호 입력 (+, -, *, /, %) : ");
        char op = sc.next().charAt(0);
        System.out.println("op = " + op);

        // 연산의 결과를 저장할 변수
        int result = 0;

        switch (op) {

            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second; // 0으로 나누면 ArithmeticException 에러발생
                break;
            case '%' :
                result = first % second;
                break;
        }

        /*
         *default문은 생략 가능하지만, 생략하는 경우 주석으로 생략한 이유를 작성해 주는 것이 좋다.
         */

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void testSwitchVendingMachine() {

        /*
         * switch문을 이용해서 문자열 값 비교 및 break 테스트
         * 1. JDK 1.7이상부터 switch문을 이용하여 문자열을 비교할 수 있다.
         * 2. break를 사용하지 않으면 멈추지 않고, 계속 실행구문을 동작시킨다.
         */

        System.out.println("========== Ohgiraffers vending machine ==========");
        System.out.println("   사이다    콜라    환타     박카스    핫식스   ");
        System.out.println("=================================================");
        System.out.print("음료를 선택해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        // 원하는 음료에 맞는 가격을 저장할 변수
        int price = 0;

        switch (selectedDrink) {
            case "사이다" :
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
            case "콜라" :
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
            case "환타" :
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
            case "박카스" :
                System.out.println("박카스를 선택하셨습니다.");
                price = 2000;
            case "핫식스" :
                System.out.println("핫식스를 선택하셨습니다.");
                price = 3000;
        }

        System.out.println(price + "원을 투입해 주세요!");

        System.out.println("=============== 개선된 자판기 ===============");

        String order = "";

        switch (selectedDrink) {
            case "사이다" :
                order = "사이다";
                price = 500;
                break;
            case "콜라" :
                order = "콜라";
                price = 600;
                break;
            case "환타" :
                order = "환타";
                price = 700;
                break;
            case "박카스" :
                order = "박카스";
                price = 2000;
                break;
            case "핫식스" :
                order = "핫식스";
                price = 3000;
                break; // 맨 마지막 case는 break 생략 가능
        }

        System.out.println(order + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해 주세요!");
    }
}
