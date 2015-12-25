package sk.onko.bracketcolors;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ondrej on 21.12.2015.
 */
public class BracketScanner {

    private String originalString;


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

        Map<Integer, StringElement> htmlStringToken = changeToStringElements(originalString);

        String stringToReturn = "";

        int currentLeftBracket = 0;

        Map<Integer, Boolean> isPaired = new HashMap<Integer, Boolean>();

        for (int charPosition = 0; charPosition < originalString.length(); charPosition++) {

            if (htmlStringToken.get(charPosition).isLeftBracket()) {
                currentLeftBracket++;
                isPaired.put(currentLeftBracket, false);
                htmlStringToken.get(charPosition).setBracketDepth(currentLeftBracket);
            } else if (htmlStringToken.get(charPosition).isRightBracket()) {

              /*  Scans the isPaired HashMap from the biggest number to the lowest, looking for
                    first unpaired left bracket and pairs it with found right bracket*/
                for (int i = isPaired.size(); i > 0; i--) {

                    if (isPaired.get(i) == false) {

                        System.out.println("Right bracket at position " + charPosition + "is paired and has ID" + i);

                        isPaired.remove(i);
                        isPaired.put(i, true);

                        htmlStringToken.get(charPosition).setBracketDepth(i);
                        break;
                    }

                }

            }

        }


        for (int charPosition = 0; charPosition < originalString.length(); charPosition++) {

            stringToReturn = stringToReturn.concat(htmlStringToken.get(charPosition).getS());
        }

        return ("<html>" + stringToReturn + "</html>");

    }


    private Map<Integer, StringElement> changeToStringElements(String originalString) {

        Map<Integer, StringElement> htmlStringToken = new HashMap<Integer, StringElement>();

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
        return htmlStringToken;
    }


}
