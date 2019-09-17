package string;

public class Compare {

    public static void main(String[] args) {

        String  value ="lonlo";
        String value2 ="hina";
        String value3="KONA";
        System.out.println(value.compareTo(value2));
        System.out.println(value.compareToIgnoreCase(value3));

        //ends-starts with
        System.out.println(value.startsWith("l"));
        System.out.println(value.endsWith("l"));

        //replace
        System.out.println(value.replace('n','&'));
        System.out.println(value.replace('a','A'));

        //to upper-lower case
        System.out.println(value.toUpperCase());
    }
}
