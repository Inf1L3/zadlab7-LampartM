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
public class Osoba {
    private String imie;
    private String nazwisko;
    private String dataurodzenia;
    private String plec;

    public Osoba(String imie, String nazwisko, String dataurodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(String dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

     @Override
    public String toString() {
        return "" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data_urodzenia='" + dataurodzenia + '\'' +
                ", plec='" + plec + '\'';
    }
    
    
   
}
