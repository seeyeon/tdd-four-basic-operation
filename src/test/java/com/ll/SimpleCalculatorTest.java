package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SimpleCalculatorTest {
    @Test
    @DisplayName("1+2=3")
    public void t1(){
        SimpleCalculator simpleCalculator= new SimpleCalculator();
        int rs = simpleCalculator.plus(1,2);

        //assertEquals(3, rs);
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("10+2=12")
    public void t2(){
        SimpleCalculator simpleCalculator= new SimpleCalculator();
        int rs = simpleCalculator.plus(10,2);

        assertThat(rs).isEqualTo(12);
    }

    @Test
    @DisplayName("10+20=30")
    public void t3(){
        SimpleCalculator simpleCalculator= new SimpleCalculator();
        int rs = simpleCalculator.plus(10,20);

        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("10- 5=5")
    public void t4(){
        SimpleCalculator simpleCalculator= new SimpleCalculator();
        int rs = simpleCalculator.minus(10,5);

        assertThat(rs).isEqualTo(5);
    }

    @Test
    @DisplayName("10 * 2 =20")
    public void t5(){
        SimpleCalculator simpleCalculator= new SimpleCalculator();
        int rs = simpleCalculator.multiply(10,2);

        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("10 / 2 =5")
    public void t6(){
        SimpleCalculator simpleCalculator= new SimpleCalculator();
        int rs = simpleCalculator.divide(10,2);

        assertThat(rs).isEqualTo(5);
    }

}
