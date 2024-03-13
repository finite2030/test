package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

/* 하나의 class 내에서 여러가지 package를 사용하고 싶은 경우 */
import java.util.Date;
// import java.sql.Date;
// 자주 사용하는 패키지를 import하고, 사용 빈도가 적은 패키지는 풀패키지명을 입력하여 사용


// import com.ohgiraffers.section01.method.*; // '*' 표시는 패키지 경로 내에 있는 모든 것 사용

public class Application2 {

    public static void main(String[] args) {

        /*
         1. F2로 오류가 있는 곳 검색
         2. import class로 자동 넣는 기능 사용
         */

        /*
         * 임포트란?
         * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
         * 하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
         * 따라서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
         * import는 package 선언문과 class 선언문 사이에 작성하며
         * 어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
         *
         * 임프토를 안해도 사용할 수 있는 package가 있다. --> java.lang패키지
         */

        /*
        임포트 방식 1
        import com.ohgiraffers.section01.method.Calculator;
         */

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50, 60);
        System.out.println("50과 60 중 더 작은 값은 : " + min);

        int max = Calculator.maxNumberOf(50, 60);

        System.out.println("50과 60 중 더 큰 값은 : " + max);

        /*
        임포트 방식 2
        import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
         */
        int max2 = maxNumberOf(100, 200);
        System.out.println("100과 200 중 더 큰 값은 : " + max2);

        Date date = new Date();
        java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());
    }
}
