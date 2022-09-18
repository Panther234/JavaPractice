package RealVNC;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class MilesToKmConverter {
    public final double milesToKm(double miles) {
        return getMilesToKmFactor() * miles;
    }

    public double getMilesToKmFactor() {
        return 1.609;
    }
}


