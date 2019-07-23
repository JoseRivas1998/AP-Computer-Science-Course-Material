import java.util.Random;

public class Example1 {

    public static void main(String[] args) {
        Random random = new Random();
        double a = 3.0;
        double b = 4.0;

        double aSq = Math.pow(a, 2);
        double bSq = Math.pow(b, 2);

        double c = Math.sqrt(aSq + bSq);
        System.out.println(c);

        double area = 314.159;
        double radius = Math.sqrt(area / Math.PI);
        System.out.println(radius);

        double p = 1000.00;
        double interest = 0.05;
        double years = 20;

        double balance = p * Math.pow(1 + interest, years);
        System.out.println(balance);

        int i1 = random.nextInt(100);
        int i2 = random.nextInt(100);
        System.out.println(i1);
        System.out.println(i2);

        int diff = Math.abs(i1 - i2);
        System.out.println("Absolute diff: " + diff);

        double d1 = random.nextDouble() * 100.0;
        double d2 = random.nextDouble() * 100.0;
        System.out.println(d1);
        System.out.println(d2);

        double diff1 = Math.abs(d1 - d2);
        System.out.println("Absolute Diff: " + diff1);

    }

}
