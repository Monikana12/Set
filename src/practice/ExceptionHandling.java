package practice;


public class ExceptionHandling {

    public static void main(String[] args) {

        String[] name = {"Mr x", "Mr y", "Mr z", "Mr A"};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

     //try--keyword {--try block starts
        //body of the try block
     //}--try block ends catch --keyword (Exception's name which we are trying to catch e-- variable for exception){--catch
      //       block starts catch
      //}--catch block ends

        //finally --keyword --finally block always gets executed
        //mostly used for Db connectivity closing
                            //file reader closing

try {
    System.out.println(name[4]);
} catch (ArrayIndexOutOfBoundsException ex) {
    System.out.println("excetion occured");
}


int num[] ={10,20,30};


try {
    System.out.println(num[3]);
}catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("exception  handled");
        }


try {
    System.out.println(name[4]);
} catch (ArrayIndexOutOfBoundsException ex)  {
    System.out.println("caught the exception");
    ex.printStackTrace();
}

finally {


}
    }



}