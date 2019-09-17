package utility;

import java.io.*;

public class Datawriter {
    public static void main(String[] args) {

        // FileWriter fileWriter =new FileWriter("src/utility/test.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/utility/test.txt", true));

            bufferedWriter.write("writing using buffered");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
