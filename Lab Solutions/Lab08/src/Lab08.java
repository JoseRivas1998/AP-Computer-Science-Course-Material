import java.util.Arrays;
import java.util.Random;

public class Lab08 {

    public static void main(String[] args) {
        System.out.println("TESTING ARRAY SORTED LIST");
        SortedList<Integer> integerSortedList = new ArraySortedList<>();
        testList(integerSortedList);
        System.out.println();
        System.out.println("====================================");
        System.out.println();
        SortedList<Integer> integerSortedList1 = new LinkedSortedList<>();
        testList(integerSortedList1);
    }


    private static void testList(SortedList<Integer> list) {
        addValues(list);
        printList(list);
        System.out.println("List (toString) " + list);
        System.out.println("List (toArray) " + Arrays.toString(list.toArray()));
        final int NUM_TESTS = 19;
        int numPassed = 0;
        numPassed += testSize(list, 15) ? 1 : 0;
        numPassed += testFirstElement(list, 0) ? 1 : 0;
        numPassed += testLastElement(list, 50) ? 1 : 0;
        numPassed += testNthElement(list, 4, 9) ? 1 : 0;
        numPassed += testBounds(list, 0, true) ? 1 : 0;
        numPassed += testBounds(list, -1, false) ? 1 : 0;
        numPassed += testBounds(list, list.size() - 1, true) ? 1 : 0;
        numPassed += testBounds(list, list.size(), false) ? 1 : 0;
        numPassed += testBounds(list, 3, true) ? 1 : 0;

        System.out.println("REMOVING ELEMENT AT INDEX 4");
        list.remove(4);
        printList(list);
        numPassed += testSize(list, 14) ? 1 : 0;

        System.out.println("REMOVING ELEMENT AT INDEX 0");
        list.remove(0);
        printList(list);
        numPassed += testSize(list, 13) ? 1 : 0;

        System.out.println("REMOVING ELEMENT AT INDEX 12");
        list.remove(12);
        printList(list);
        numPassed += testSize(list, 12) ? 1 : 0;

        numPassed += testContains(list, 23, true) ? 1 : 0;
        numPassed += testContains(list, 0, true) ? 1 : 0;
        numPassed += testContains(list, 7, false) ? 1 : 0;

        numPassed += testIndexOf(list, 0, 0) ? 1 : 0;
        numPassed += testIndexOf(list, 11, 3) ? 1 : 0;
        numPassed += testIndexOf(list, 42, 11) ? 1 : 0;
        numPassed += testIndexOf(list, 54, -1) ? 1 : 0;

        System.out.printf("TESTS COMPLETE: %d out of %d passed.\n", numPassed, NUM_TESTS);
    }

    private static void addValues(SortedList<Integer> list) {
        list.add(0);
        list.add(35);
        list.add(0);
        list.add(39);
        list.add(14);
        list.add(42);
        list.add(5);
        list.add(11);
        list.add(17);
        list.add(29);
        list.add(50);
        list.add(23);
        list.add(9);
        list.add(3);
        list.add(35);
    }
    private static void printList(SortedList<Integer> list) {
        System.out.print("List: ");
        list.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }

    private static boolean testSize(SortedList<Integer> list, int expected) {
        int actual = list.size();
        System.out.printf("List size: %d ", list.size());
        boolean result;
        if(expected == actual) {
            System.out.println("PASSED");
            result = true;
        } else {
            System.out.printf("FAILED, expected %d\n", expected);
            result = false;
        }
        return result;
    }

    private static boolean testFirstElement(SortedList<Integer> list, int expected) {
        int actual = list.get(0);
        System.out.printf("First element: %d ", actual);
        boolean result;
        if(expected == actual) {
            System.out.println("PASSED");
            result = true;
        } else {
            System.out.printf("FAILED, expected: %d", expected);
            result = false;
        }
        return result;
    }

    private static boolean testLastElement(SortedList<Integer> list, int expected) {
        int actual = list.get(list.size() - 1);
        boolean result;
        System.out.printf("Last Element: %d ", actual);
        if(actual == expected) {
            System.out.println("PASSED");
            result = true;
        } else {
            System.out.printf("FAILED, expected: %d\n", expected);
            result = false;
        }
        return result;
    }

    private static boolean testNthElement(SortedList<Integer> list, int n, int expected) {
        int actual = list.get(n);
        boolean result;
        System.out.printf("Element at index %d: %d ", n, actual);
        if(actual == expected) {
            System.out.println("PASSED");
            result = true;
        } else {
            System.out.printf("FAILED, expected %d\n", expected);
            result = false;
        }
        return result;
    }

    private static boolean inBounds(SortedList<Integer> list, int n) {
        boolean result = true;
        try {
            list.get(n);
        } catch (IndexOutOfBoundsException e) {
            result = false;
        }
        return result;
    }

    private static boolean testBounds(SortedList<Integer> list, int n, boolean expected) {
        boolean actual = inBounds(list, n);
        System.out.printf("Index %d in bounds? %s ", n, actual ? "yes" : "no");
        boolean result;
        if(actual == expected) {
            System.out.println("PASSED");
            result = true;
        } else {
            System.out.printf("FAILED, expected %s\n", expected ? "yes" : "no");
            result = false;
        }
        return result;
    }

    private static boolean testContains(SortedList<Integer> list, int n, boolean expected) {
        boolean actual = list.contains(n);
        System.out.printf("List contains %d? %s ", n, actual ? "yes" : "no");
        boolean result;
        if(actual == expected) {
            System.out.println("PASSED");
            result = true;
        } else {
            System.out.printf("FAILED, expected: %s\n", expected ? "yes" : "no");
            result = false;
        }
        return result;
    }

    private static boolean testIndexOf(SortedList<Integer> list, int n, int expected) {
        int actual = list.indexOf(n);
        System.out.printf("Index of %d: %d ", n, actual);
        boolean result;
        if(actual == expected) {
            System.out.println("PASSED");
            result = true;
        } else {
            System.out.printf("FAILED, expected %d\n", expected);
            result = false;
        }
        return result;
    }

}
