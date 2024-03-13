package com.ohgiraffers.section02.assignment;

public class Application1 {

    public static void main(String[] args) {

        /*
         *  대입연산자와 산술 복합 대입 연산자
         *  '='  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함 (대입연산자)
         *  아래 5가지는 산술 복합 대입연산자
         *  '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
         *  '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
         *  '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
         *  '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
         *  '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
         */

        int num = 12;
        System.out.println("num = " + num); // 12

        // num(변수)를 받아와서 3을 증가시키고, num(변수)에 증가시킨 값을 대입(할당)함
        // 대입연산자 활용
        num = num + 3;
        System.out.println("num = " + num); // 15

        // 산술 복합 대입 연산자 활용
        num += 3;
        System.out.println("num = " + num); // 18

        num -= 5;
        System.out.println("num = " + num); // 13

        num *= 2;
        System.out.println("num = " + num); // 26

        num /= 2;
        System.out.println("num = " + num); // 13

        num %= 2;
        System.out.println("num = " + num); // 1

        System.out.println("최종 num = " + num); // 산술 복합 대입연산자는 산술과 대입을 동시에 하므로 변수를 새로운 값으로 할당함.

    }
}
