public class Example1 {

    public static void main(String[] args) {
        // Boxing the value 3 into two integer objects
        Integer integer1 = new Integer(3);
        Integer integer2 = new Integer(3);

        System.out.println(integer1);
        System.out.println(integer2);

        boolean b1 = integer1 == integer2;
        System.out.println(b1); // False because we have separate instances of integer

        boolean b2 = integer1.equals(integer2);
        System.out.println(b2); // Now it is true, because the .equals checks the boxed values

        // Unboxing the values to their primitives
        int i1 = integer1.intValue();
        int i2 = integer2.intValue();

        System.out.println(i1);
        System.out.println(i2);

        boolean b3 = i1 == i2;
        System.out.println(b3); // Comparing primitives with == is fine

        // Autoboxing
        Integer integer3 = 4;
        Integer integer4 = 4;

        System.out.println(integer3);
        System.out.println(integer4);

        boolean b4 = integer3 == integer4;
        System.out.println(b4); // Why is this true now? It may be how java optimizes autoboxing, similar to String literals

        Integer integer5 = 5;
        Integer integer6 = 7;

        boolean b5 = integer5.compareTo(integer6) > 0;
        System.out.println(b5); // False because 5 is not greater than 7

        // Auto unboxing
        int i3 = integer5;
        int i4 = integer6;

        boolean b6 = i3 > i4;
        System.out.println(b6); // Equivalent to b5

    }

}
