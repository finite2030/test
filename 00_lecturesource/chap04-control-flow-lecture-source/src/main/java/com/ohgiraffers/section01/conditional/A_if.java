package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    // 메소드 내용 보이기 / 숨기기 ( ctrl + '-' / ctrl + '+' )
    public void testSimpleIfStatement() {

        /*
         * [ if문 표현식 ]
         * if(조건식) {
         *   조건식이 true일 때 실행할 명령문;
         * }
         *
         * 조건식 : true or false가 나오는 연산식을 조건식이라고 한다.
         * if문은 조건식의 결과 값이 참(true)이면, {}안에 코드를 실행하고
         * 조건식의 결과 값이 거짓(false)이면, {}안에 있는 코드를 무시하고 넘어간다.
         */

        /*
         *  정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고,
         *  짝수가 아니면 출력하지 않는 구문을 작성해보자
         *  단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         */

        // 정수 한 개를 입력 받아 --> scanner, nextInt
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        // 그 수가 짝수 이면 --> if (조건식)이 참이면,
        // "입력하신 숫자는 짝수입니다." 출력 --> System.out.println
        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        // 짝수가 아니면 출력 X --> 생략 가능
        // 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력 --> System.out.print
        System.out.print("프로그램을 종료합니다.");
    }

    // nested = 중첩 (if문은 중첩 가능)
    public void testNestedIfStatement() {

        /*
         * 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
         * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
         * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자
         * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         */

        // 정수 한 개를 입력 받아 --> scanner, nextInt
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        // 그 수가 양수인 경우에만 짝수인지를 확인 --> if
        if(num > 0) {
            // 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다. --> if
            if(num % 2 == 0) {
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
        }
        // 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문 작성 --> 생략
        // 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다."라고 출력
        System.out.println("프로그램을 종료합니다.");
    }
}
