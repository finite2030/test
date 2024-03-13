package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 자동 형변한과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다.
        */

        int inum = 10;
        long lnum = 100;

        // int isum = inum + lnum;
        int isum = (int) (inum + lnum); // 괄호 안에 있는 연산을 먼저하고 계산 결과의 자료형을 int(자료형)로 강제 형변환하는 방법
        System.out.println("isum = " + isum); // 강제 형변환

        int isum2 = inum + (int) lnum; // long 자료형인 lnum 변수만 먼저 int 자료형으로 강제 형변환하고 연산하는 방법
        System.out.println("isum2 = " + isum2); // 강제 형변환

        long lsum = inum + lnum;
        System.out.println("lsum = " + lsum); // 자동 형변환

        // 주의사항 * int미만의 연산 처리결과는 int형이다.
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

        // 확인 방법
        // short result1 = byteNum1 + byteNum2; // 연산 처리결과는 int형이므로 byte보다 큰 자료형인 short로도 할당안됨
        int result2 = byteNum2 + shortNum1; // 연산 처리결과는 int형이므로 할당됨
        long result3 = shortNum1 + byteNum1; // 연산 처리결과는 int형이므로 int보다 큰 자료형인 long에 할당 가능
        float result4 = shortNum1 + shortNum2; // long과 동일한 현상

        System.out.println("result1 = " + result2);
        System.out.println("result2 = " + result3);
        System.out.println("result2 = " + result4);
    }
}
