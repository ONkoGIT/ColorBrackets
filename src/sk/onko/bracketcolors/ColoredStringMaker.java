package sk.onko.bracketcolors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ondrej on 21/12/2015.
 */
public class ColoredStringMaker {

    private String inputString;

    public ColoredStringMaker() {

    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
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

    public static String getCyanString(String input) {
        return ("<font color=#00FFFF>" + input + "</font>");
    }

    public static String getFuchsiaString(String input) {
        return ("<font color=#FF00FF>" + input + "</font>");
    }

    public static String getYellowGreenString(String input) {
        return ("<font color=#9ACD32>" + input + "</font>");
    }

    public static String getGoldString(String input) {
        return ("<font color=#DAA520>" + input + "</font>");
    }

    public static String getDarkMagentaString(String input) {
        return ("<font color=#8B008B>" + input + "</font>");
    }

    public static String getChocolateString(String input) {
        return ("<font color=#D2691E>" + input + "</font>");
    }

    /*
    Methods for creating custom sized html Strings
     */
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

    public static String getCyanString(String input, int size) {
        return ("<font color=#00FFFF size=" + size + ">" + input + "</font>");
    }

    public static String getFuchsiaString(String input, int size) {
        return ("<font color=#FF00FF size=" + size + ">" + input + "</font>");
    }

    public static String getYellowGreenString(String input, int size) {
        return ("<font color=#9ACD32 size=" + size + ">" + input + "</font>");
    }

    public static String getGoldString(String input, int size) {
        return ("<font color=#DAA520 size=" + size + ">" + input + "</font>");
    }

    public static String getDarkMagentaString(String input, int size) {
        return ("<font color=#8B008B size=" + size + ">" + input + "</font>");
    }

    public static String getChocolateString(String input, int size) {
        return ("<font color=#D2691E size=" + size + ">" + input + "</font>");
    }


}