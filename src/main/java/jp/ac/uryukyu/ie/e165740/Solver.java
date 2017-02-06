package jp.ac.uryukyu.ie.e165740;

import java.util.Scanner;

/**
 * Created by e165740 on 2017/02/05.
 */
public class Solver {
    private int money = 100;
    int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12};
    int betMoney;
    int betMunber;
    int hitNum;
    //現在の所持金、賭け金の設定、賭ける数字の設定を行う
    public void bet(int money){


        // 所持金を示す
        System.out.printf("現在の所持金は $ %d です。\n",money);
        //掛け金を決める
        System.out.println("掛け金はいくらにしますか？");
        Scanner stdIn1 = new Scanner(System.in);
        System.out.print("bet is: $ ");
        betMoney = stdIn1.nextInt();
        //賭ける数字を決める
        System.out.println("賭ける数字を入力してください。");
        Scanner stdIn2 = new Scanner(System.in);
        System.out.print("賭ける数字は:");
        betMunber = stdIn2.nextInt();

    }

    //当選番号を出力する
    public void turn(){
        hitNum = (int)(Math.random()*12);
        System.out.printf("当選番号は「 %d 」\n",hitNum);
    }

    //賭け金、賭けた数字によって配当を決め、所持金にプラス,またはマイナスにする
    public void profit(){
        money -= betMoney;
        if(betMunber == hitNum){
            System.out.print("大当たり！！\n");
            betMoney = betMoney*2;
            money += betMoney;
        }else{
            System.out.print("ハズレ\n");
            betMoney = 0;
        }
        System.out.printf("配当は $ %d です\n",betMoney);
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }

}