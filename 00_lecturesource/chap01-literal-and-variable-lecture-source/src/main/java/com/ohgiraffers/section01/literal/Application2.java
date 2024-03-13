package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        // 정수와 정수의 연산

        System.out.println("============== 정수와 정수의 연산 ============== ");
        System.out.println(123 + 456); // add 579
        System.out.println(123 - 23); // subtract 100
        System.out.println(123 * 10); // multiply 1230
        System.out.println(123 / 10); // divide : quotient 12
        System.out.println(123 % 10); // divide : remainder 3

        System.out.println("============== 실수와 실수의 연산 ============== ");
        System.out.println(1.23 + 1.23); // 2.46
        System.out.println(1.23 - 0.23); // 1.0
        System.out.println(1.23 * 10.0); // 12.3
        System.out.println(1.23 / 10.0); // 0.123
        System.out.println(1.23 % 10.0); // 실수의 경우 약간의 오차가 생긴다.
        System.out.println(1.23 % 0.3); //

        // 정수와 실수를 연산하면 실수로 형 변환한다. (자료형 필수 확인)
        System.out.println("============== 정수와 실수의 연산 ==============");
        System.out.println(123 + 0.5); // 123.5
        System.out.println(123 - 0.5); // 122.5
        System.out.println(123 * 0.5); // 61.5
        System.out.println(123 / 0.5); // 246.0
        System.out.println(123 % 0.5); // 0.0

        // 문자의 연산
        // ASKII Code ('a' = 97, 'b' = 98)
        System.out.println("============== 문자와 문자의 연산 ==============");
        System.out.println('a' + 'b'); // 97 + 98 = 195
        System.out.println('a' - 'b'); // 97 - 98 = -1
        System.out.println('a' * 'b'); // 97 * 98 = 9506
        System.out.println('a' / 'b'); // 97 / 98 = 0
        System.out.println('a' % 'b'); // 97 % 98 = 97

        System.out.println("============== 문자와 정수의 연산 ==============");
        // 문자와 정수를 연산하면 자료형이 정수 형태로 변형된다.
        System.out.println('a' + 1); // 97 + 1 = 98
        System.out.println('a' - 1); // 97 - 1 = 96
        System.out.println('a' * 2); // 97 * 2 = 194
        System.out.println('a' / 2); // 97 / 2 = 48 // 자료형이 정수이므로 소수점 0.5 표현 불가
        System.out.println('a' % 2); // 97 % 2 = 1

        System.out.println("============== 문자와 실수의 연산 ==============");
        // 문자와 실수를 연산하면 자료형이 실수 형태로 변형된다.
        System.out.println('a' + 1.0); // 97 + 1.0 = 98.0
        System.out.println('a' - 1.0); // 97 - 1.0 = 96.0
        System.out.println('a' * 2.0); // 97 * 2.0 = 194.0
        System.out.println('a' / 2.0); // 97 / 2.0 = 48.5
        System.out.println('a' % 2.0); // 97 % 2.0 = 1.0

        /*
         * 결론은 문자는 컴퓨터 내부적으로 숫자 취급을 한다.
         * 결국 지금까지 숫자끼리의 연산을 본 것이고,
         * 숫자(정수 혹은 실수) 형태의 값은 수학의 사칙연산과 mod연산이 전부 가능하다.
         */

        // 문자열의 연산
        // 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(이어 붙이기)가 된다.
        System.out.println("============== 문자열과 문자열의 연산 ==============");
        System.out.println("hello" + "world"); // helloworld
        // System.out.println("hello" - "world"); // 허용 x
        // System.out.println("hello" * "world"); // 허용 x
        // System.out.println("hello" / "world"); // 허용 x
        // System.out.println("hello" % "world"); // 허용 x

        // 문자열과 다른 형태의 값 연산
        // 문자열과 다른 형태의 값 '+' 연산 결과는 새로운 문자열로 생성되어 합치기가 된다.
        System.out.println("============== 문자열과 다른 형태의 값 '+' 연산 ==============");
        System.out.println("helloworld" + 123); // helloworld123
        System.out.println("helloworld" + 123.456); // helloworld123.456
        System.out.println("helloworld" + 'a'); // helloworlda
        System.out.println("helloworld" + true); // helloworldture

        // 숫자로 된 문자열 형태의 값은 '+' 연산 결과는 새로운 문자열로 생성되어 합치기 결가가 된다.
        System.out.println("============== 문자열 형태의 숫자 값 '+' 연산 ==============");
        System.out.println("123" + "456"); // 123456

        // 논리값 연산
        // 논리값은 문자열을 제외한 나머지와 연산할 경우 에러가 발생한다.
        System.out.println("============== 논리값 '+' 연산 ==============");
        // System.out.println(true + 'a'); 논리값과 문자 값의 연산은 에러 발생
        // System.out.println(true + false); // 에러 발생
        // System.out.println(true - false); // 에러 발생
        // System.out.println(true * false); // 에러 발생
        // System.out.println(true / false); // 에러 발생
        // System.out.println(true % false); // 에러 발생

        // System.out.println(true + 1); // 에러 발생
        // System.out.println(true - 1); // 에러 발생
        // System.out.println(true * 1); // 에러 발생
        // System.out.println(true / 1); // 에러 발생
        // System.out.println(true % 1); // 에러 발생

        // 문자는 내부적으로 숫자 취급하기 때문에 결국 논리값과 숫자의 연산과 동일한 의미이다.
        // System.out.println(true + 'a'); // 에러 발생
        // System.out.println(true - 'a'); // 에러 발생
        // System.out.println(true * 'a'); // 에러 발생
        // System.out.println(true / 'a'); // 에러 발생
        // System.out.println(true % 'a'); // 에러 발생

        // 논리값과 문자열의 연산은 '+' 연산만 사용가능하다.
        System.out.println("============== 논리와 문자열의 연산 ==============");
        System.out.println(true + "a"); // truea
        // System.out.println(true - "a"); // 에러 발생
        // System.out.println(true * "a"); // 에러 발생
        // System.out.println(true / "a"); // 에러 발생
        // System.out.println(true % "a"); // 에러 발생
    }
}
