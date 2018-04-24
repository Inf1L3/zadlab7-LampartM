package pl.edu.ur.oopl7.zad2;

import java.util.Random;

/**
 *
 * @author Maciek
 */
public class Punkt3D extends Punkt2D{
    public double z;

    public Punkt3D() {
        x = 0;
        y = 0;
    }

    public Punkt3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public void random(){
        Random losowe = new Random();
        x = (-10) + (10 - (-10)) * losowe.nextDouble();
        y = (-10) + (10 - (-10)) * losowe.nextDouble();
        z = (-10) + (10 - (-10)) * losowe.nextDouble();
    }

    @Override
    public String toString() {
        return "Punkt 3D ma współrzędne:\nX = "  + Double.toString(x) + 
                ",\nY= " + Double.toString(y) + ",\nZ= " + Double.toString(z);
    }
    
}