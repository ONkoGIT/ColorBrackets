package sk.onko.bracketcolors;

/**
 * Created by Ondrej on 21.12.2015.
 */
public class StringElement {

    private String s;
    private int bracketPosition;
    private int bracketDepth = 0;
    private boolean isLeftBracket = false;
    private boolean isRightBracket = false;

    public StringElement(String s) {
        setS(s);
    }

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

    public int getBracketPosition() {
        return bracketPosition;
    }

    public void setBracketPosition(int bracketPosition) {
        this.bracketPosition = bracketPosition;
    }

    public int getBracketDepth() {
        return bracketDepth;
    }

    public void setBracketDepth(int bracketDepth) {
        this.bracketDepth = bracketDepth;
    }


    public String getS(int textSize) {

        switch (bracketDepth) {
            case 1:
                return ColoredStringMaker.getBlueString(s, textSize);
            case 2:
                return ColoredStringMaker.getRedString(s, textSize);
            case 3:
                return ColoredStringMaker.getGreenString(s, textSize);
            case 4:
                return ColoredStringMaker.getOrangeString(s, textSize);
            case 5:
                return ColoredStringMaker.getCyanString(s, textSize);
            case 6:
                return ColoredStringMaker.getFuchsiaString(s, textSize);
            case 7:
                return ColoredStringMaker.getYellowGreenString(s, textSize);
            case 8:
                return ColoredStringMaker.getGoldString(s, textSize);
            case 9:
                return ColoredStringMaker.getDarkMagentaString(s, textSize);
            case 10:
                return ColoredStringMaker.getChocolateString(s, textSize);
            default:
                return s;

        }

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