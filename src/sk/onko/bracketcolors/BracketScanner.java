package sk.onko.bracketcolors;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ondrej on 21.12.2015.
 */
public class BracketScanner {

    private String originalString;
    private Map<Integer, StringElement> htmlStringToken = new HashMap<Integer, StringElement>();

    public String getOriginalString() {
        return originalString;
    }

    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    /*
    returns String with colored brackets, for JLabel to use
     */
    public String getHtmlString(String originalString) {

        setOriginalString(originalString);

        for (int charPosition = 0; charPosition < originalString.length(); charPosition++) {

            char currentChar = originalString.charAt(charPosition);

            if (currentChar != '(' & currentChar != ')') {

                if (!htmlStringToken.containsKey(charPosition)) {

                    htmlStringToken.put(charPosition, new StringElement(Character.toString(currentChar)));

                } else {

                    String oldString = htmlStringToken.get(charPosition).getS();
                    String newString = oldString + Character.toString(currentChar);
                    htmlStringToken.put(charPosition, new StringElement(newString));
                }

            } else {

                htmlStringToken.put(charPosition, new StringElement(Character.toString(currentChar)));

            }

        }


        String stringToReturn = "";

        int leftBracketPosition = -1;
        int rightBracketPosition = -1;

        boolean weGotLeftBracketLast = false;

        for (int charPosition = 0; charPosition < originalString.length(); charPosition++) {

            System.out.println("Scanning" + charPosition);


            StringElement currentScannedElement = htmlStringToken.get(charPosition);

            if (currentScannedElement.isLeftBracket()) {
                System.out.println("Left bracket found at position " + charPosition);
                leftBracketPosition = charPosition;
                weGotLeftBracketLast = true;

            } else if (currentScannedElement.isRightBracket()) {
                if (weGotLeftBracketLast) {
                    rightBracketPosition = charPosition;
                    htmlStringToken.get(leftBracketPosition).setBracketDepth(1);
                    htmlStringToken.get(rightBracketPosition).setBracketDepth(1);
                }


            }


        }


        for (int charPosition = 0; charPosition < originalString.length(); charPosition++) {

            stringToReturn = stringToReturn.concat(htmlStringToken.get(charPosition).getS());
        }


        return ("<html>" + stringToReturn + "</html>");

    }
}
