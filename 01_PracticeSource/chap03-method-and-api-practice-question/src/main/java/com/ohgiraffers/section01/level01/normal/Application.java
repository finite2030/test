package com.ohgiraffers.section01.level01.normal;

import java.sql.SQLOutput;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        System.out.println("main() 메소드 시작함....");

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */

//        RandomMaker random = new RandomMaker(); // RandomMaker 객체 생성

        System.out.println(RandomMaker.rockPaperScissors());
//        RandomMaker.rockPaperScissors();

        System.out.println(RandomMaker.tossCoin());

        System.out.println("main() 메소드 종료됨....");

    }
}
