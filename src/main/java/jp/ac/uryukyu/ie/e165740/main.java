package jp.ac.uryukyu.ie.e165740;

import java.util.Scanner;

/**
 * Created by e165740 on 2017/01/31.
 */
public class main {

    public static void main(String[] args) {


        System.out.print("ルーレット\n");
        System.out.println("どれを行いますか？\n 1.ルーレット\n 2.ルール説明\n");
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Input:");
        int a = stdIn.nextInt();

        switch (a){
            case 1:
                System.out.println("");

                Solver solver = new Solver();
                Solver.bet();
                Solver.turn();

                break;
            case 2:
                System.out.println(" ------ルール説明------\n ");

                break;
            default:
                System.out.println("終了します");
                break;
        }

    }
}
