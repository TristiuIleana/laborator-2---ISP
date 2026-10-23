package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String prenume, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public List<Integer> getNote() {
        return note;
    }

    public boolean esteIntegralist() {
        for (int nota : note) {
            if (nota < 5) {
                return false;
            }
        }
        return true;
    }

    public double medie() {
        if (note.isEmpty()) return 0;
        int suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        return (double) suma / note.size();
    }

    public int numarRestante() {
        int nr = 0;
        for (int nota : note) {
            if (nota < 5) {
                nr++;
            }
        }
        return nr;
    }

    @Override
    public String toString() {
        return grupa + " " + String.format("%10s", nume) + " " + prenume + " Note: " + note + " Medie: " + String.format("%.2f", medie()) + " Restante: " + numarRestante();
    }
}