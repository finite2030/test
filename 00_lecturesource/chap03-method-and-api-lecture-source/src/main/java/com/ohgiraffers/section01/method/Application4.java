package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');
//      app4.testMethod(20, "유관순", '여'); // 값으 갯수는 맞지만 전달인자 순서가 다르게 전달되므로 호출하지 못한다.

        String name = "유관순";
        int age = 20;
        char gender = '여'; // 변수로 들어오지만 매개변수 final char gender로 들어갈 경우 무조건 상수로 변경됨

        app4.testMethod(name, age, gender);
    }

    // 아래 명령어 키 : "/*** 엔터"
    /***
     * 이름과 나이, 성별을 출력하는 메소드
     * @param name 이름
     * @param age 나이
     * @param gender 성별
     */

    // 아래 매개변수 3가지 ( 일반변수, 일반변수, 상수(매개변수로 사용될 때는 이름을 영문자 소문자로도 가능 )
    public void testMethod(String name, int age, final char gender) {

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");

    }
}
