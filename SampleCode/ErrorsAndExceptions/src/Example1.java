import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Items: ");

        int items = scanner.nextInt();

        if(items <= 0) {
            throw new IllegalArgumentException("Number of items must be non negative");
        }

        double total = 0;
        for(int i = 0; i < items; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            double item = scanner.nextDouble();
            total += item;
        }

        double average = total / items;
        System.out.println("Average: " + average);


    }

}
