package basic;

public class Ray {

    public static void main(String[] args) {

        //Array symbol --[]
       String [] name ={"hina","tina","jina","kina"};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        System.out.println(name.length);

        for (int n =0; n<4; n++) {
            System.out.println(name[n]);
        }
        for(int a=0;a< name.length;a++) {
            System.out.println(name[a]);
        }

        Object[] test ={"oop",1};
        for (int u =0;u < test.length;u++) {
            System.out.println(test[1]);
        }

    }

}
