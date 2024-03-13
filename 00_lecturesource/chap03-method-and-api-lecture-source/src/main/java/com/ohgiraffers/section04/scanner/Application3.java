package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 스캐너의 next() 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서 읽어온다.
         * 그래서 크게 두 가지 사항을 주의해야 한다.
         * 1. next()로 문자열 입력받은 후 정수, 실수, 논리 값 입력받을 때
         * 2. 정수, 실수, 논리 값 입력 후 next()로 문자열 입력받을 때
         */

        Scanner sc = new Scanner(System.in); // 객체 생성

        /* next()로 버퍼 공간에 담겨있는 데이터 삭제 후 입력받기 */
        System.out.print("문자열을 입력해 주세요 : "); // 안녕하세요 반갑습니다.
        String str1 = sc.next(); // 안녕하세요 (공백문자전까지 입력을 받고 남은 문자열 데이터는 버퍼 공간에 담음)
        System.out.println("str1 : " + str1);
        sc.nextLine(); // 버퍼 공간에 담겨있는 데이터(반갑습니다.)를 비워주는 명령어

        /* next()로 버퍼 공간에 담겨있는 데이터 공백문자를 기준으로 문자열 입력받기 2*/
        /*
        System.out.print("문자열을 입력해 주세요 : ");
        String str1 = sc.next();
        System.out.println("str1 : " + str1);

        String str2 = sc.next();
        System.out.println("str2 : " + str2);
         */

        System.out.print("숫자를 입력해 주세요 : ");
        int num1 = sc.nextInt(); // 20\n (개행문자를 포함하여 버퍼 공간으로 담아준다.)
        System.out.println("num1 : " + num1);

        /* 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때 */
//        System.out.print("다시 숫자를 입력해 주세요 : ");
//        int num2 = sc.nextInt(); // 30\n (개행문자 포함)
//        System.out.println("num2 = " + num2);

        sc.nextLine(); // 버퍼 공간에 담겨있는 \n(개행문자)를 비워준다.

        /* 알아볼 필요가 있음!
        sc.next(); // next명령어로 버퍼 공간에 담겨있는 개행문자 비우는 것은 왜 안되는 것일까?
         */

//        System.out.println(sc.next());

        System.out.print("공백이 있는 문자열을 하나 입력해 주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);
    }
}