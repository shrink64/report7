package jp.ac.uryukyu.ie.e165740;

import java.util.Scanner;

/**
 * Created by e165740 on 2017/02/05.
 */
public class Solver {

    int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12};

    public static void bet(){  //現在の所持金、賭け金の設定、賭ける数字の設定を行う

        int money = 100;
        System.out.printf("現在の所持金は %d です。",money);
        System.out.println("掛け金はいくらにしますか？");
        Scanner stdIn = new Scanner(System.in);
        System.out.print("bet is:");
        int betM = stdIn.nextInt();

        System.out.println("");

    }

    public static void turn(){  //当選番号を出力する
        int hitNum = (int)(Math.random()*12);
        System.out.printf("当選番号は「 %d 」\n",hitNum);
    }

}

