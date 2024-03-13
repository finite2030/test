package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {
        /*
        * 변수를 사용하는 방법
        * 1. 변수를 준비한다. (선언)
        * 2. 변수에 값을 대입한다. (값 대입 및 초기화)
        * 3. 변수를 사용한다.
         */

        /*
        * 자료형이란?
        * 다양한 값의 형태별로 어느정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
        * 예) 앞에서 사용한 int 자료형은 정수를 4Byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        * 이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다.
         */

        /* 기본 자료형(Primary type) 8가지 */
        // 정수를 취급하는 자료형
        // =(대입 연산자가 없는 경우 변수 선언만 한다는 뜻.
        byte bnum; // 1byte = 8bit ( -128 ~ 127 )
        short snum; // 2byte = 16bit ( -32,768 ~ 32,767 )
        int inum; // 4byte = 32bit ( -2,147,483,648 ~ 2,147,483,647 )
        long lnum; // 8byte = 64bit ( -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 )

        // 실수를 취급하는 자료형
        float fnum; // 4byte = 32bit ( 1.175494e^-38 ~ 3.402823e^+38 ) / 유효 자릿수 : 7
        double dnum; // 8byte = 64bit ( 2.225074e^-308 ~ 1.797693e^+308 ) / 유효 자릿수 : 16

        // 문자를 취급하는 자료형
        char ch; // 2byte = 16bit ( 0 ~ 65,535 )
        char ch2; // 2byte = 16bit ( 0 ~ 65,535 )

        // 논리값을 취급하는 자료형
        boolean isTrue; // 1byte = 8bit ( true, false )

        /* 참조 자료형(Reference type) 1가지 */
        String str; // 4byte = 32bit ( 주소 값이며 범위는 4byte 정수형 )

        // 값 대입 및 초기화
        bnum = 1; // byte 자료형
        snum = 2; // short 자료형
        inum = 4; // int 자료형
        // lnum = 8; // 아무 문제 없는 것 같지만, 뒤에 소문자 or 대문자 L을 붙여야 한다. (형변환 때문)
        // 대문자 추천하는 이유 : 가독성이 좋은 대문자 추천 (l vs L)
        // 글꼴에 따라 소문자 'l'은 숫자 '1'과 혼선을 야기할 수 있어서 대문자 권장
        lnum = 8L; // long 자료형

        // fnum = 4.0; // float 자료형에 double 자료형을 대입하는 것은 불가능하다.
        fnum = 4.0f; // 실수 뒤에 'f'를 붙여야 한다. 'F'도 가능하지만 소문자를 사용하는 것이 일반적이다.
        dnum = 8.0;

        ch = 'a'; // 문자 형태의 값을 저장할 수 있다.
        ch2 = 97; // 'a'는 97이라는 숫자이기 때문에 숫자로도 지정할 수 있다.

        System.out.println(ch2); // 문자 자료형으로 선언되었기 때문에 숫자를 대입하여도 출력 값은 'a' 문자로 표시된다.

        isTrue = true;
        isTrue = false; // true 혹은 false 중 한 가지의 값만 사용 가능하다.

        str = "안녕하세요";

        /* 선언과 동시에 초기화하기 */
        int point = 100;
        int bonus = 10;

        System.out.println("=============== 변수에 저장된 값 출력 ===============");
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);

        System.out.println("fnum의 값 : " + fnum);
        System.out.println("dnum의 값 : " + dnum);

        System.out.println("ch의 값 : " + ch2);
        System.out.println("ch2의 값 : " + ch2);

        System.out.println("isTrue의 값 : " + isTrue);
        System.out.println("str의 값 : " + str);

        System.out.println("포인트와 보너스의 합 : " + (point + bonus));

        /*
        * 대입 연산자의 왼편에는 공간이라는 의미, 오른 편에는 값이라는 의미
         */

        point = point + 100;
        System.out.println("point = point + 100 : " + point); // 200
    }
}
