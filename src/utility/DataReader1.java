package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader1 {

    public static void main(String[] args) {

        String text ;
        String a =null;


            try {
                FileReader fileReader = new FileReader("/Users/qamrunnahar/IdeaProjects/Set/src/utility/info.txt");

                BufferedReader bufferedReader =new BufferedReader(fileReader);

                while((text=bufferedReader.readLine())!=null) {
                    a =text;
                }

                fileReader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {

            }
        System.out.println(a);
    }
    }


