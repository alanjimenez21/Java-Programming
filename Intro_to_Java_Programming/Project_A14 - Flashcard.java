/**
 *Write a program called FlashCard.java to teach addition of numbers with one digit past
 *the decimal. You are required to use the WidgetViewer.java file provided by the instructor
 *in the BlackBoard.
 *Your program should use either a Random object or Math.random to generate two random
 *numbers between 0.0 and 9.9 (inclusive). Each number should have a single digit to the
 *left of the decimal point, and a single digit to the right of the decimal point. If you choose
 *to use a Random object, google "oracle java api random," click on the first link, and look up
 *the nextInt or nextDouble methods.

 */
package MyJavaFX; //I created my package called MyJavaFX

import javax.swing.*;


public class FlashCard {
    public static void main(String[] args) {
        //Call WidgetViewer Class
        WidgetViewer wv = new WidgetViewer();

        //Declare Random Variables
        double randomOne = (Math.random() * 10) + 1;
        double randomTwo = (Math.random() * 10) + 1;

        //Constraint Variables to 1 decimal only
        randomOne = Double.parseDouble(String.format("%.1f", randomOne));
        randomTwo = Double.parseDouble(String.format("%.1f", randomTwo));
        double sum = Double.parseDouble(String.format("%.1f", randomOne + randomTwo));

        //Created Instructions & answer space
        JLabel jlInstructions = new JLabel("What is the sum of " + randomOne + " plus " + randomTwo + "?");
        JTextField answerSpace = new JTextField(5);

        //Add Features to Widget
        wv.add(jlInstructions, 10, 40, 300, 20);
        wv.add(answerSpace, 10, 70, 50, 20);

        //Button
        JButton executeButton = new JButton("Click After Answering");
        wv.addAndWait(executeButton);

        //Read Box Answer, Compare to Sum, and Output Result
        double answer = Double.parseDouble(answerSpace.getText());
        if (sum == answer) {
            JLabel correct = new JLabel("That's right. Good Job");
            wv.add(correct, 10, 100, 150, 20);
        } else {
            JLabel incorrect = new JLabel("Sorry, the correct answer is " + sum);
            wv.add(incorrect, 10, 100, 350, 20);
        }

    }

}
