import java.util.Scanner;

public class BoxDrawerTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;
        char symbol1, symbol2;
        System.out.println("Welcome to Box Drawer!");
        System.out.println("This program can draw rectangle boxes like the following");
        System.out.println(BoxDrawer.drawRectangle(5,5));
        System.out.println();

        System.out.println("Let's draw a rectangle with any letter you like.");
        System.out.print("Please enter how many rows you want it to have: ");
        row = input.nextInt();
        System.out.print("Please enter how many columns you want it to have: ");
        column = input.nextInt();
        System.out.print("Please enter the letter you want it to have: ");
        symbol1 = input.next().charAt(0);
        String rectangleString = BoxDrawer.drawRectangle(row, column, symbol1);
        System.out.println(rectangleString);

        System.out.println();
        System.out.println("Let's draw another rectangle with 2 different letters you like.");
        System.out.print("Please enter how many rows you want it to have: ");
        row = input.nextInt();
        System.out.print("Please enter how many columns you want it to have: ");
        column = input.nextInt();
        System.out.print("Please enter the first letter you want it to have: ");
        symbol1 = input.next().charAt(0);
        System.out.print("Please enter the second letter you want it to have: ");
        symbol2 = input.next().charAt(0);
        BoxDrawer.drawFancyRectangle(row, column, symbol1, symbol2);
    }
}
