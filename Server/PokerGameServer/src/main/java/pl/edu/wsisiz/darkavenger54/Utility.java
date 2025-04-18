package pl.edu.wsisiz.darkavenger54;

public class Utility
{
    static boolean tryParseStringToInt(String string)
    {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
