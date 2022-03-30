// 학점부여 프로그램 100~90점은 A, 89~80 B, 79~70 C, 69~60 D, 나머지는 F
package com.test.note;

import java.util.Scanner;

public class notrExam {
    public static void main(String[] args) {

        int ranking = 5;
        char medalColor;

        switch(ranking) {
            case 1 : medalColor = 'G';
                break;
            case 2 : medalColor = 'S';
                break;
            case 3 : medalColor = 'B';
                break;
            default : medalColor = 'A';

        }
        System.out.println(ranking + " 등 메달의 색깔은 " + medalColor + "입니다.");


        
    }
}