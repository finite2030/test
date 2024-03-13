package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /* 메소드 전달 인자와 매개변수에 대한 이해 */

        /*
         * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
         */

        /*
         * 변수의 종류
         * 1. 지역 변수
         * 2. 매개 변수
         * 3. 전역 변수(필드)
         * 4. 클래스(static) 변수
         */

        /*
         * 지역 변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
         *
         * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
         * 이 때 전달하는 값을 전달인자(argument)라고 부르고, 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
         *
         */

        Application3 app3 = new Application3(); // 객체 생성
        app3.testMethod(40); // 전달인자
//        app3.testMethod("40");
//        app3. testMethod(20, 30, 40); // 매개변수는 int형 1개이지만 인자는 3개이기 때문에 호출할 수 없다.
//        app3.testMethod(); // 매개변수는 선언되어 있지만 인자로 값이 전달하지 않으면 호출할 수 없다.

        int age = 20;
        app3.testMethod(age); // 전달인자로 변수명을 담는 것도 가능하다.

        byte byteAge = 10;
        app3.testMethod(byteAge); // 자동 형변환 (작은 데이터의 범위는 큰 데이터의 범위로 자동 형 변환됨 [byte < int(기준)])

        long longAge = 80;
        app3.testMethod((int) longAge); // 강제 형변환

        app3.testMethod(age * 3); // 전달인자의 연산 결과를 매개변수로 전달할 수도 있다.

    }

    public void testMethod(int age) { // 매개변수
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
