package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
         * nextLine() : 공백을 포함한 한 줄을 입력받기 위해 개행문자전까지 읽어서 문자열로 반환한다. (공백문자 포함)
         * next() : 공백 문자나 개행문자전까지를 읽어서 문자열로 반환한다. (공백문자 포함하지 않는다)
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("인사말을 입력해 주세요 : ");
        String greeting1 = sc.nextLine(); // 안녕하세요 반갑습니다. -> 안녕하세요 반갑습니다.
        System.out.println("greeting1 = " + greeting1);

        System.out.print("인사말을 입력해 주세요 : ");
        String greeting2 = sc.next(); // 안녕하세요 반갑습니다. -> 안녕하세요
        System.out.println("greeting2 = " + greeting2);
        System.out.println(sc.next());
    }
}