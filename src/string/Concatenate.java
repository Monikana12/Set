package string;

public class Concatenate {

    public static void main(String[] args) {

        String a ="rock";
        String b="and";
        String c ="tech";

        System.out.println(a+b+c);

        //concat
        String x ="hina";
        String y= "star";

        String z=x.concat(y);
        System.out.println(z);


        //StringBuilder

        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("yoyo");
        stringBuilder.append("tiya");
        System.out.println(stringBuilder);



        StringBuilder stringBuilder1 =new StringBuilder();
        for(int i=0;i<5;i++) {
            stringBuilder1.append(i);
        }
        System.out.println(stringBuilder1);

        String numbers= "";
        for(int i=0;i<6;i++) {
            numbers=numbers+=i;
        }
        System.out.println(numbers);



    }
}
