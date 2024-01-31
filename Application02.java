package com.ohgiraffers.section02;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumber0f;

public class Application02 {
    public static void main(String[] args) {

        //수업목표. 임포트에 대해 이해할 수 있다.
        //임포트란 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 함.
        //하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다
        //그래서 패키지명을 생각하고 사용할 수 있도록 한 구문이 import구문이다.
        //import는 pacakage 선언문과 class 선언문 사이에 작성하며
        //어떤 패키지 내에 있는 클래스를 사용할 것 인지에 대해 미리 선언하는 효과를 가짐

        Calculator calc = new Calculator();
        int min=calc.minNumber0f(50,60);

        System.out.println("min="+min);

        int max = maxNumber0f(50,60);

        System.out.println("max="+max);

        int max2 = maxNumber0f(100,200);

        System.out.println("max2="+max2);

    }



    }

