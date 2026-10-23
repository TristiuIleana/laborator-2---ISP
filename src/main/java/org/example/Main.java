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
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));

        //a
        for (Student s : studenti) {
            for (int i = 0; i < 5; i++) {
                s.getNote().add(rand.nextInt(7) + 4);
            }
        }

        //b1
        Collections.sort(studenti, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int cmpGrupa = s1.getGrupa().compareTo(s2.getGrupa());
                if (cmpGrupa != 0) return cmpGrupa;

                int cmpNume = s1.getNume().compareTo(s2.getNume());
                if (cmpNume != 0) return cmpNume;

                return s1.getPrenume().compareTo(s2.getPrenume());
            }
        });

        System.out.println("b1)");
        for (Student s : studenti) {
            System.out.println(s);
        }

        //b2
        List<Student> integralisti = new ArrayList<>();
        for (Student s : studenti) {
            if (s.esteIntegralist()) {
                integralisti.add(s);
            }
        }

        Collections.sort(integralisti, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.medie(), s1.medie()); // descrescator
            }
        });

        System.out.println("b2)");
        for (Student s : integralisti) {
            System.out.println(s);
        }

        //b3
        List<Student> restantieri = new ArrayList<>();
        for (Student s : studenti) {
            if (!s.esteIntegralist()) {
                restantieri.add(s);
            }
        }

        Collections.sort(restantieri, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.numarRestante(), s2.numarRestante()); // crescator
            }
        });

        System.out.println("b3)");
        for (Student s : restantieri) {
            System.out.println(s);
        }
    }
}