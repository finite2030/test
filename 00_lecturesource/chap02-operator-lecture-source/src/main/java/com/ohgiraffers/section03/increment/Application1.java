package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 증감연산자
         * 피연산자의 앞 or 뒤에 사용이 가능하다.
         * '++' : 1 증가의 의미
         * '--' : 1 감소의 의미
         */

        int num = 20;
        System.out.println("num = " + num); // 20

        num++; // 후위 증가연산자
        System.out.println("num = " + num); // 21

        ++num; // 전위 증가연산자
        System.out.println("num = " + num); // 22

        num--; // 후위 감소연산자
        System.out.println("num = " + num); // 21

        --num; // 전위 감소연산자
        System.out.println("num = " + num); // 20

        /* 주의사항.
         *  증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다는 것이다.
         *  다른 연산자와 함께 사용할 때 증감 연산자의 의미
         *  '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함 (선행)
         *  'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴 (후행)
         *  '--var' : 피연산자의 값을 먼저 1 감소 시킨 후 다른 연산을 진행함
         *  'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
         */

        int firstNum = 20;
        int result1 = firstNum++ * 3; // 20(21) * 3
        // 후위 증가 연산자는 첫 번째 호출에서는 연산하지 않고 두 번째 호출에서 연산한다.

        System.out.println("firstNum = " + firstNum); // 21
        System.out.println("result1 " + result1); // 60

        int secondNum = 20;
        int result2 = ++secondNum * 3; // 21(21) * 3
        // 전위 증가 연산자는 첫 번째 호출에서 바로 연산한다.

        System.out.println("secondNum = " + secondNum); // 21
        System.out.println("result2 = " + result2); // 63

        int num1 = 10;
        int addNum = num1++; // 10(11)

        System.out.println("addNum = " + addNum);
    }
}
