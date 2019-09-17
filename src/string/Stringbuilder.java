package string;

public class Stringbuilder {

    public static String getReversed (String value) {
        StringBuilder stringbuilder =new StringBuilder();
        for (int i = value.length() -1; i>=0; i--) {
            stringbuilder.append(value.charAt(i));
        }
        return stringbuilder.toString();
    }
    public static String getReversedViaString(String value) {
        String finalText ="";
        for (int i =value.length() -1; i>=0; i--){
        }
        return finalText;

    }

    public static void main(String[] args) {
        System.out.println(getReversed("Example"));
    }
}



