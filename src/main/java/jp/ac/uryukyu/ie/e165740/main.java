package jp.ac.uryukyu.ie.e165740;

import java.util.Scanner;

/**
 * Created by e165740 on 2017/01/31.
 */
public class main {

    public static void main(String[] args) {

        Solver solver = new Solver();
        System.out.print("ルーレット\n");
        System.out.println("どれを行いますか？\n 1.ルーレット\n 2.ルール説明\n");
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Input:");
        int a = stdIn.nextInt();

        switch (a){
            case 1:
                System.out.println("");

                while(solver.getMoney() > 0) {
                    solver.bet();
                    solver.turn();
                    solver.profit();
                }
                System.out.println("終了します");
                break;

            case 2:
                System.out.println(" ------ルール説明------\n ");
                System.out.println("ルーレットは1~12の中の数字が存在している。\n");
                System.out.println("所持金は $ 100 で、まず賭け金を決めて、続いて賭ける数字を決める。\n");
                System.out.println("数字が当たれば、賭け金の倍の金額を与えられる。\n");
                System.out.println("所持金が 0 になるとゲームオーバー\n");


                break;
            default:
                System.out.println("終了します");
                break;
        }
    }
}
