package jp.ac.uryukyu.ie.e165740;

import java.util.Scanner;

/**
 * Created by e165740 on 2017/02/05.
 */
public class Solver {
    private int money = 100;
    private int betMoney;
    private int betNumber;
    private int hitNum;

    //現在の所持金、賭け金の設定、賭ける数字の設定を行う
    public void bet() {
        // 所持金を示す
        System.out.printf("現在の所持金は $ %d です。\n", money);
        //掛け金を決める
        System.out.println("掛け金はいくらにしますか？");
        Scanner stdIn1 = new Scanner(System.in);
        System.out.print("bet is: $ ");
        betMoney = stdIn1.nextInt();
        //賭ける数字を決める
        System.out.println("賭ける数字を入力してください。");
        Scanner stdIn2 = new Scanner(System.in);
        System.out.print("賭ける数字は:");
        betNumber = stdIn2.nextInt();
    }

    //当選番号を出力する
    public void turn() {
        hitNum = (int) (Math.random() * 12);
        System.out.printf("当選番号は「 %d 」\n", hitNum);
    }

    //賭け金、賭けた数字によって配当を決め、所持金にプラス,またはマイナスにする
    public void profit() {
        money -= betMoney;
        if (betNumber == hitNum) {
            System.out.print("大当たり！！\n");
            betMoney = betMoney * 2;
            money += betMoney;
        } else {
            System.out.print("ハズレ\n");
            betMoney = 0;
        }
        System.out.printf("配当は $ %d です\n", betMoney);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(int betMoney) {
        this.betMoney = betMoney;
    }

    public int getBetNumber() {
        return betNumber;
    }

    public void setBetNumber(int betNumber) {
        this.betNumber = betNumber;
    }

    public int getHitNum() {
        return hitNum;
    }

    public void setHitNum(int hitNum) {
        this.hitNum = hitNum;
    }

}