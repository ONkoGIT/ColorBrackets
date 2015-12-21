package sk.onko.bracketcolors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ondrej.janosik on 21/12/2015.
 */
public class BracketFinder {

    private ColoredStringMaker coloredStringMaker;
    private String inputText;
    private String returnedHtmlText;

    public String getReturnedHtmlText() {
        return returnedHtmlText;
    }

    public void setReturnedHtmlText(String returnedHtmlText) {
        this.returnedHtmlText = returnedHtmlText;
    }

    public BracketFinder(String inputText) {

        this.inputText = inputText;

    }

    private List<Integer> leftBrackets = new ArrayList<Integer>();
    private List<Integer> rightBrackets = new ArrayList<Integer>();


    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public void findBrackets() {

        leftBrackets.clear();

        rightBrackets.clear();
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == '(') {
                leftBrackets.add(i);
            } else if (inputText.charAt(i) == ')') {
                rightBrackets.add(i);
            }
        }

        if (leftBrackets.size() != rightBrackets.size()) {

        }

        coloredStringMaker=new ColoredStringMaker(inputText, leftBrackets,rightBrackets);

       // this.setReturnedHtmlText(coloredStringMaker.getColoredString());


    }


}
