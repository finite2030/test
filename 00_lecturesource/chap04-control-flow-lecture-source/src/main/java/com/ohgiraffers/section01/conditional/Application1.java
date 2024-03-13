package com.ohgiraffers.section01.conditional;

public class Application1 {

    public static void main(String[] args) {
        // 실행용 클래스
        // 동일한 패키지 내에 있는 클래스는 별도로 import 하지 않아도 됨.

        A_if aif = new A_if();

//        aif.testSimpleIfStatement(); // 단일 if문

//        aif.testNestedIfStatement(); // 중첩 if문

        B_ifElse bifElse = new B_ifElse();

//        bifElse.testSimpleIfElseStatement(); // if-else문

//        bifElse.testNestedIfElseStatement(); // if-else 중첩문

        C_ifElseIf cifElseIf = new C_ifElseIf();

//        cifElseIf.testSimpleIfElseIfStatement(); // if-else-if문

//        cifElseIf.testNestedIfElseIfStatement(); // if-else-if 중첩문

        D_switch dSwitch = new D_switch();

//        dSwitch.testSimpleSwitchStatement(); // switch 단일

//        dSwitch.testSwitchVendingMachine(); // switch 중첩문
    }
}