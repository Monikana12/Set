package string;

public class StringConcatenate {

    public static void main(String[] args) {
        String a ="people";
        String b ="and";
        String c ="tech";

        System.out.println(a+b+c);

        //concat

        String x ="Rock";
        String y ="star";

        String z=x.concat(y);
        System.out.println(z);

        //StringBuilder

        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("rock");
        stringBuilder.append("star");
        System.out.println(stringBuilder);



        StringBuilder stringBuilder1=new StringBuilder();
        for(int i=0;i<5;i++) {
            stringBuilder1.append(i);
        }
        System.out.println(stringBuilder1);


        String numbers="";
        for (int i=0;i<6;i++) {
            numbers=numbers+=i;
        }
        System.out.println(numbers);


    }
}
