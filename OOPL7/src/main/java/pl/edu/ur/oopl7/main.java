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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student( 1234 , "Dzienne", "Inf", 1, "Andrzej", "Kowal", "10-01-1997","M");
        Wykladowca d = new Wykladowca("Magister","Inforamtyka","Jan","Nowak","20-03-1987","M");
        
        System.out.println(s1.toString());
        System.out.println(d.toString());
    }
    
}
