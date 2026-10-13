package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String prenume, String grupa, List<Integer> note) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }
    public void notaAleatorie(){
    Random nota = new Random();
    for(int i = 0; i<5; i++){
        note.add(nota.nextInt(7)+4);
       }
    }
    public String toString(){
        return grupa + " " + nume + " " + prenume + " ";
    }
    public static void main(String[] args){
        List<Student> stundeti = new ArrayList<>();
        //stundeti.add(new Student("Tristiu","Ileana","21/1")

    }
}
