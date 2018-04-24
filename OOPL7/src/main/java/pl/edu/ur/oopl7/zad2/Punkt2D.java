package pl.edu.ur.oopl7.zad2;

import java.util.Random;

/**
 *
 * @author Maciek
 */
public class Punkt2D {
    public double x;
    public double y;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void random(){
        Random losowe = new Random();
        x = (-10) + (10 - (-10)) * losowe.nextDouble();
        y = (-10) + (10 - (-10)) * losowe.nextDouble();
    }

    @Override
    public String toString() {
        return "Punkt 2D ma współrzędne:\nX = "  + Double.toString(x) + 
                ",\n Y=" + Double.toString(y);
    }
}