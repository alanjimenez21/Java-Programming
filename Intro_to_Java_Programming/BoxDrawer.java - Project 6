/**
Description: This program will print three rectangles with three different methods.
 */


public class BoxDrawer {
    static final char DEFAULT_LETTER = 'x';

    public static String drawRectangle(int row, int column) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sb.append(DEFAULT_LETTER);
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static String drawRectangle(int row, int column, char symbol) {
        StringBuilder secondRectangle = new StringBuilder();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                //append works as concatenation
                secondRectangle.append(symbol);
            }
            // \n creates a new line
            secondRectangle.append('\n');
        }
        return secondRectangle.toString();
    }

    public static void drawFancyRectangle(int row, int column, char symbol1, char symbol2) {
        StringBuilder thirdRectangle = new StringBuilder();
        //Loop to print both symbols
        for (int i = 0; i < row / 2; i++) {
            //Loop for the first symbol
            for (int j = 0; j < column; j++) {
                thirdRectangle.append(symbol1);
            }
            thirdRectangle.append("\n");
            //Loop for the second symbol
            for (int x = 0; x < column; x++) {
                thirdRectangle.append(symbol2);
            }
            thirdRectangle.append("\n");
        }
        //Print final result
        System.out.println(thirdRectangle);
    }
}
