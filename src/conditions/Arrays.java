package conditions;

public class Arrays {

    public static void main(String[] args) {
        // Array Symbol --[]
        String[] name = {"Mr x", "Mr y", "Mr b", "Mr l"};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        System.out.println(name.length);


        for (int a = 0; a < 4; a++) {
            System.out.println(name[a]);
        }
        for (int a = 0; a < name.length; a++) {
            System.out.println(name[a]);
        }

        Object[] test = {"Mr oop", 1};
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);


        }


    }}
