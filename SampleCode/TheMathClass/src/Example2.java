public class Example2 {

    public static void main(String[] args) {
        double a = 10;
        double b = 50;

        double min = Double.MAX_VALUE;
        double max = 0;

        for (int i = 0; i < 1000; i++) {
            double x = b * Math.random();
            min = Math.min(x, min);
            max = Math.max(x, max);
        }
        System.out.println("Min: " + min + " Max: " + max);

        min = Double.MAX_VALUE;
        max = 0;

        for (int i = 0; i < 1000; i++) {
            double x = Math.random() + a;
            min = Math.min(x, min);
            max = Math.max(x, max);
        }
        System.out.println("Min: " + min + " Max: " + max);

        min = Double.MAX_VALUE;
        max = 0;

        for (int i = 0; i < 1000; i++) {
            double x = (b - a) * Math.random() + a;
            min = Math.min(x, min);
            max = Math.max(x, max);
        }
        System.out.println("Min: " + min + " Max: " + max);

    }

}
