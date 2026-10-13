package org.example;
import java.util.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static void main(String[] args) {

        //ex 2.7.1
        System.out.println("Ex. 2.7.1");
        Random rand = new Random();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }
        Collections.sort(x);
        Collections.sort(y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //a
        List<Integer> xPlusY = new ArrayList<>();
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("a)" + xPlusY);

        //b
        Set<Integer> zSet = new TreeSet<>();
        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println("b)" + zSet);

        //c
        List<Integer> xMinusY = new ArrayList<>();
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("c)" + xMinusY);

        //d
        int p = 6;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        for (int numar : xPlusY) {
            if (numar <= 6) {
                xPlusYLimitedByP.add(numar);
            }
        }
        System.out.println("d" + xPlusYLimitedByP);

        //ex 2.7.2
        System.out.println("Ex. 2.7.2");
    }
}