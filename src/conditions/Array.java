package conditions;

public class Array {

    public static void main(String[] args) {
        //Array Symbol --[]
        String[] name = {"Mr x", "Mr y", "Mr z", "Mr A"};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        System.out.println(name.length);


        for (int a = 0; a < 3; a++) {
            System.out.println(name[a]);
        }
        for (int a = 0; a < name.length; a++) {
            System.out.println(name[a]);
        }


        Object[] objectArray = {"Mr B", 1};

        for (int i = 0; i < objectArray.length; i++) {
            System.out.println(objectArray[i]);

        }
        // Enhance for loop
        int[] id = {12, 11, 111, 112, 113};

        for (int t : id) {
            System.out.println(t);

        }

        System.out.println("*****");

        int[] numbers = new int[3];

        numbers[0] = 11;
        numbers[1] = 12;
        numbers[2] = 13;
        System.out.println(numbers.length);
        System.out.println(numbers[2]);

        int[] newArray = numbers.clone();

        System.out.println(newArray.length);
        System.out.println(newArray[2]);

        System.out.println(newArray[3]);
    }

}