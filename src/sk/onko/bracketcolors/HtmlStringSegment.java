package sk.onko.bracketcolors;

/**
 * Created by ondrej.janosik on 21/12/2015.
 */
public class HtmlStringSegment {


    private boolean isLeftBracket = false;
    private boolean isRightBracket = false;

    public boolean isLeftBracket() {
        return isLeftBracket;
    }

    public void setLeftBracket(boolean leftBracket) {
        isLeftBracket = leftBracket;
    }

    public boolean isRightBracket() {
        return isRightBracket;
    }

    public void setRightBracket(boolean rightBracket) {
        isRightBracket = rightBracket;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;


}
