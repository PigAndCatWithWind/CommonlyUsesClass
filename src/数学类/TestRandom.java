package 数学类;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        //random [0,1) double
        System.out.println(random.nextDouble());
        //random int
        System.out.println(random.nextInt());
        //random [0,1) float
        System.out.println(random.nextFloat());
        //random false or true
        System.out.println(random.nextBoolean());
        //random [0,10) int
        System.out.println(random.nextInt(10));
        //random [20,30) int
        System.out.println(20+random.nextInt(10));
        //random [20,30) int
        System.out.println(20+(int)(random.nextDouble()));
        System.out.println();
    }
}
