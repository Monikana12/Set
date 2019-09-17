package utility;

import java.util.Properties;

public class Execution {
    public static void main(String[] args) {


        DataReader dataReader = new DataReader();
        dataReader.readMyFile("/Users/qamrunnahar/IdeaProjects/Set/src/utility/test.txt");


        String value = null;
        DataReader dataReader1 = new DataReader();
        dataReader1.readMyFile("/Users/qamrunnahar/IdeaProjects/Set/src/utility/test.txt");
        System.out.println("value is : " + value);

        //properties
        System.out.println("***  properties ");
        // dataReader.getProperties("src/utility/peopleNtech.properties");

        //void
        Input input = new Input();
        Properties properties = input.getProperties("src/utility/peopleNtech.properties");
        System.out.println(properties.getProperty("year"));
        System.out.println(properties.getProperty("name"));


    }

}
