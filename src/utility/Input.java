package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Input {

    public void getPropert(String filepath) {
        Properties properties = new Properties();


        try {
            InputStream inputStream = new FileInputStream("/Users/qamrunnahar/IdeaProjects/Set/src/utility/peopleNtech.properties");
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("year"));
        System.out.println(properties.getProperty("name"));
    }
    // return--properties

    public Properties getProperties(String filepath) {
        Properties properties = new Properties();


        try {
            InputStream inputStream = new FileInputStream(filepath);
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
    //properties

    public static void main(String[] args) {

    }
}
