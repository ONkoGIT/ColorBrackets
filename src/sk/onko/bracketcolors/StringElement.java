package sk.onko.bracketcolors;

/**
 * Created by Ondrej on 21.12.2015.
 */
public class StringElement {

    private String s;

    public int getBracketPosition() {
        return bracketPosition;
    }

    public void setBracketPosition(int bracketPosition) {
        this.bracketPosition = bracketPosition;
    }

    private int bracketPosition;

    public int getBracketDepth() {
        return bracketDepth;
    }

    public void setBracketDepth(int bracketDepth) {
        this.bracketDepth = bracketDepth;
    }

    private int bracketDepth = 0;

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

    public StringElement(String s) {
        this.s = s;

        if (s.charAt(0) == '(') {
            System.out.println("Left bracket found");

            this.isLeftBracket = true;
        } else if (s.charAt(0) == ')') {
            System.out.println("Right bracket found");
            this.isRightBracket = true;
        }


    }

    public String getS() {
        if (bracketDepth == 1) {

            return ColoredStringMaker.getBlueString(s, 40);

        } else if (bracketDepth == 2) {

            return ColoredStringMaker.getRedString(s, 40);

        } else if (bracketDepth == 3) {

            return ColoredStringMaker.getGreenString(s, 40);

        } else if (bracketDepth == 4) {

            return ColoredStringMaker.getOrangeString(s, 40);

        } else
            return s;
    }

    public void setS(String s) {
        this.s = s;

        if (s.charAt(0) == '(') {
            System.out.println("Left bracket found");

            this.isLeftBracket = true;
        } else if (s.charAt(0) == ')') {
            System.out.println("Right bracket found");
            this.isRightBracket = true;
        }

    }
}
