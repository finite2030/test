package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 형변환 사용 시 주의할 점
        * 데이터 손실에 유의해서 사용해야 한다.
        */

        // 의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum = " + inum); // 290
        System.out.println("bnum = " + bnum); // 34 ( 8Byte 초과되는 데이터는 손실됨 )

        float height = 185.5f;
        int floorHeight = (int) height;
        System.out.println("height = " + height);
        System.out.println("floorHeight = " + floorHeight); // float(실수형)을 int(정수형) 자료형으로 강제 형변환하여 소수점 절삭을 이용할 수 있다.
    }
}
