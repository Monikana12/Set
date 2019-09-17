package practice;

public class TestClassForSingleton {

    String x;

    private static TestClassForSingleton testClassForSingleton =null;

    private TestClassForSingleton() {
        x ="this is a singleton class";

    }

    public static TestClassForSingleton getInstance() {
      if(testClassForSingleton ==null)  {
          testClassForSingleton = new TestClassForSingleton();
      }
      return testClassForSingleton;
    }
}
