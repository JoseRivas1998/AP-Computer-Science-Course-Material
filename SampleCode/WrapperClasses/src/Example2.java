public class Example2 {

    public static void main(String[] args) {
        // Boxing the value 3 into two integer objects
        Double double1 = new Double(3.14);
        Double double2 = new Double(3.14);

        System.out.println(double1);
        System.out.println(double2);

        boolean b1 = double1 == double2;
        System.out.println(b1); // False because we have separate instances of integer

        boolean b2 = double1.equals(double2);
        System.out.println(b2); // Now it is true, because the .equals checks the boxed values

        // Unboxing the values to their primitives
        double d1 = double1.doubleValue();
        double d2 = double2.doubleValue();

        System.out.println(d1);
        System.out.println(d2);

        boolean b3 = d1 == d2;
        System.out.println(b3); // Comparing primitives with == is fine

        // Autoboxing
        Double double3 = 2.72;
        Double double4 = 2.72;

        System.out.println(double3);
        System.out.println(double4);

        boolean b4 = double3 == double4;
        System.out.println(b4); // Now this is false, how strange. This is why we shouldn't use == with objects!

        Double double5 = 1.0 / 3.0;
        Double double6 = 1.0 / 4.0;

        boolean b5 = double5.compareTo(double6) > 0;
        System.out.println(b5); // True, because 1/3 > 1/4

        // Auto unboxing
        double d3 = double5;
        double d4 = double6;

        boolean b6 = d3 > d4;
        System.out.println(b6); // Equivalent to b5

    }

}
