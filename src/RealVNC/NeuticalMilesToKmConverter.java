package RealVNC;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class NeuticalMilesToKmConverter extends MilesToKmConverter {
    @Override
    public double getMilesToKmFactor() {
        return 1.852;
    }
    public static void main(String[] args) {
        System.out.println(((MilesToKmConverter)new NeuticalMilesToKmConverter()).milesToKm(1));
        System.out.println(new NeuticalMilesToKmConverter().milesToKm(1));
        System.out.println(new MilesToKmConverter().milesToKm(1));
        System.out.println(((NeuticalMilesToKmConverter)new MilesToKmConverter()).milesToKm(1));

    }
}
