package utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestReader {

    public static void main(String[] args) {
        writeText("src/utility/test.txt", "whatever");
    }
        public static void writeText (String filePath, String value){

            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/utility/test.txt", false));
                bufferedWriter.write(value);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
