public class Example3 {

    public static void main(String[] args) {
        int a = 10;
        int b = 50;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 1000; i++) {
            int n = (int)(Math.random() * b);
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        System.out.println("Min: " + min + " Max: " + max);

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        for (int i = 0; i < 1000; i++) {
            int n = (int) ((b - a) * Math.random()) + a;
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        System.out.println("Min: " + min + " Max: " + max);

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < 1000; i++) {
            int n = (int) ((b - a + 1) * Math.random()) + a;
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        System.out.println("Min: " + min + " Max: " + max);
    }

}
