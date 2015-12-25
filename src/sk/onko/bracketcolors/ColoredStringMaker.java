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


    public static String getBlueString(String input) {
        return ("<font color=blue>" + input + "</font>");
    }

    public static String getRedString(String input) {
        return ("<font color=red>" + input + "</font>");
    }

    public static String getGreenString(String input) {
        return ("<font color=green>" + input + "</font>");
    }

    public static String getOrangeString(String input) {
        return ("<font color=orange>" + input + "</font>");
    }


    public static String getBlueString(String input, int size) {
        return ("<font color=blue size=" + size + ">" + input + "</font>");
    }

    public static String getRedString(String input, int size) {
        return ("<font color=red size=" + size + ">" + input + "</font>");
    }

    public static String getGreenString(String input, int size) {
        return ("<font color=green size=" + size + ">" + input + "</font>");
    }

    public static String getOrangeString(String input, int size) {
        return ("<font color=orange size=" + size + ">" + input + "</font>");
    }

}

