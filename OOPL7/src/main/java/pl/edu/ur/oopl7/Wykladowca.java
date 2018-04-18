/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Wykladowca extends Osoba{
    
    public String stopien;
    public String dziedzina;

    public Wykladowca(String stopien, String dziedzina, String imie, String nazwisko, String dataurodzenia, String plec) {
        super(imie, nazwisko, dataurodzenia, plec);
        this.stopien = stopien;
        this.dziedzina = dziedzina;
    }

    public String getStopien() {
        return stopien;
    }

    public void setStopien(String stopien) {
        this.stopien = stopien;
    }

    public String getDziedzina() {
        return dziedzina;
    }

    public void setDziedzina(String dziedzina) {
        this.dziedzina = dziedzina;
    }
    
    @Override
    public String toString() {
        return "Wykladowca{" + super.toString() +
                "stopien=" + stopien +
                ", dziedzina='" + dziedzina + '\'' +
                '}';
    }
    
}
