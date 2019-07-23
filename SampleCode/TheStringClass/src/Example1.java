public class Example1 {

    public static void main(String[] args) {

        String s1 = "oh no!";
        String s2 = "oh no!";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s1 = "oh no!";
        s2 = new String("oh no!");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("cat".equals("Cat"));
        System.out.println("cat".equalsIgnoreCase("Cat"));

        System.out.println("A".compareTo("B"));
        System.out.println("A".compareTo("A"));

        System.out.println("B".compareTo("A"));
        System.out.println("B".compareTo("B"));

        testSubString("unhappy", 2);
        testSubString("cold", 4);
        testSubString("cold", 5);
        testSubString("strawberry", 5, 7);
        testSubString("crayfish", 4, 8);
        testSubString("crayfish", 4, 9);
        testSubString("crayfish", 5, 4);

        String s = "funnyfarm";
        int x = s.indexOf("farm");
        System.out.println(x);
        x = s.indexOf("farmer");
        System.out.println(x);
        int y = s.length();
        System.out.println(y);

    }

    private static void testSubString(String s, int beginIndex) {
        try {
            System.out.println(s.substring(beginIndex));
        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }

    private static void testSubString(String s, int beginIndex, int endIndex) {
        try {
            System.out.println(s.substring(beginIndex, endIndex));
        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }

}
