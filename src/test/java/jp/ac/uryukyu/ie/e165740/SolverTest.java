package jp.ac.uryukyu.ie.e165740;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolverTest {

    @Test
    public void profit() throws Exception {
        Solver solver = new Solver();
        solver.setBetNumber(1);
        solver.setHitNum(1);
        solver.setBetMoney(20);


        solver.profit();
        assertEquals(120,solver.getMoney());


    }

}
