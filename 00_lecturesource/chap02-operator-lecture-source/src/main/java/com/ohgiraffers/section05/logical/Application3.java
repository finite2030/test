package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] arg) {
        /*
         * AND연산자 OR연산자의 특징
         * 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
         * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
         */

        /* 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
         *
         * 조건식 두 개가 모두 만족해야 true를 반환하기 때문에 앞에서 미리 false가 나오게 되면
         * 뒤의 조건을 확인할 필요 없이 false를 반환한다.
         * 따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
         */

        int num1 = 10;

        // 삼항 연산자
        int result1 = (false && ++num1 > 0)? num1 : num1; // false가 앞에 왔기 때문에 뒤에 연산은 실행 안함
        System.out.println("&& 실행 확인 : " + result1); // 10 ( 앞이 false이기 때문에 뒤에 전위 증감 연산은 실행 안함 )

        /*
         * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
         *
         * 조건식 둘 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
         * 뒤의 조건을 확인할 필요 없이 true를 반환한다.
         * 따라서, 연산 횟수를 줄이기 위해서는 || 연산의 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
         */

        int num2 = 10;

        int result2 = (true || ++num1 > 0)? num1 : num1; // 앞이 true이기 때문에 뒤에 전위 증감 연산자 실행 안함
        System.out.println("||실행 확인 : " + result2); // 10
    }
}