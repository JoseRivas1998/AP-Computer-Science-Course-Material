package example1;

public class Example1 {

    public static void main(String[] args) {
        OrderedPair o1 = new OrderedPair(1, 5);
        OrderedPair o2 = new OrderedPair(2, 8);
        OrderedPair o3 = new OrderedPair(1, 5);
        OrderedPair o4 = o2;

        System.out.println("o1: " + o1);
        System.out.println("o2: " + o2);
        System.out.println("o3: " + o3);
        System.out.println("o4: " + o4);

        System.out.println("o1 == o2:      " + (o1 == o2));
        System.out.println("o1.equals(o2): " + o1.equals(o2));

        System.out.println("o1 == o3:      " + (o1 == o3));
        System.out.println("o1.equals(o3): " + o1.equals(o3));

        System.out.println("o1 == o4:      " + (o1 == o4));
        System.out.println("o1.equals(o4): " + o1.equals(o4));

        System.out.println("o2 == o3:      " + (o2 == o3));
        System.out.println("o2.equals(o3): " + o2.equals(o3));

        System.out.println("o2 == o4:      " + (o2 == o4));
        System.out.println("o2.equals(o4): " + o2.equals(o4));

        System.out.println("o3 == o4:      " + (o3 == o4));
        System.out.println("o3.equals(o4): " + o3.equals(o4));

    }

}
