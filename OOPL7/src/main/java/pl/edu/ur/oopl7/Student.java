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
public class Student extends Osoba {
    
    private int nrindeksu;
    private String typstudiow;
    private String kierunek;
    private int rokstudiow;

    public Student(int nrindeksu, String typstudiow, String kierunek, int rokstudiow, String imie, String nazwisko, String dataurodzenia, String plec) {
        super(imie, nazwisko, dataurodzenia, plec);
        this.nrindeksu = nrindeksu;
        this.typstudiow = typstudiow;
        this.kierunek = kierunek;
        this.rokstudiow = rokstudiow;
    }

    public int getNrindeksu() {
        return nrindeksu;
    }

    public void setNrindeksu(int nrindeksu) {
        this.nrindeksu = nrindeksu;
    }

    public String getTypstudiow() {
        return typstudiow;
    }

    public void setTypstudiow(String typstudiow) {
        this.typstudiow = typstudiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRokstudiow() {
        return rokstudiow;
    }

    public void setRokstudiow(int rokstudiow) {
        this.rokstudiow = rokstudiow;
    }
    
    

    
    

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "nr_indeksu=" + nrindeksu +
                ", typ_studiow='" + typstudiow + '\'' +
                ", kierunek='" + kierunek + '\'' +
                ", rok_studiow=" + rokstudiow +
                '}';
    }
}

    
    
    
    
    

