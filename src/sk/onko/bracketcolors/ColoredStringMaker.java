package sk.onko.bracketcolors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ondrej.janosik on 21/12/2015.
 */
public class ColoredStringMaker {


    private String inputString;
    private List<Integer> leftBrackets;
    private List<Integer> rightBrackets;

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public List<Integer> getLeftBrackets() {
        return leftBrackets;
    }

    public void setLeftBrackets(List<Integer> leftBrackets) {
        this.leftBrackets = leftBrackets;
    }

    public List<Integer> getRightBrackets() {
        return rightBrackets;
    }

    public void setRightBrackets(List<Integer> rightBrackets) {
        this.rightBrackets = rightBrackets;
    }

    public ColoredStringMaker(String inputString, List<Integer> leftBrackets, List<Integer> rightBrackets) {
        this.inputString = inputString;
        this.leftBrackets = leftBrackets;
        this.rightBrackets = rightBrackets;


    }


    public ColoredStringMaker() {

    }

    public void doShit() {
        String[] splitString = inputString.split("\\(|\\)");

        for (String s : splitString) {
            System.out.print(s);
            System.out.print("    ");

        }

    }

    public static String getColoredString(String localInputString) {
        //    String[] splitString = localInputString.split("\\(|\\)");

        List<String> outputStringList = new ArrayList<String>();

        String returnedString = "<html><span style='font-size:20px'>";

        for (int i = 0; i < localInputString.length(); i++) {

            if (localInputString.charAt(i) == '(') {

                returnedString = returnedString + getBlueString(Character.toString(localInputString.charAt(i)));

            } else if (localInputString.charAt(i) == ')') {
                returnedString = returnedString + getBlueString(Character.toString(localInputString.charAt(i)));

            } else {
                returnedString = returnedString + Character.toString(localInputString.charAt(i));

            }

        }
        returnedString = returnedString + "</html>";

        System.out.print(returnedString);
        return returnedString;

    }

    private static String getBlueString(String input) {
        return ("<font color=blue>" + input + "</font>");
    }
}
