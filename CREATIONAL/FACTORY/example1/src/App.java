import phone.Android;
import phone.OS;
import phone.OperatingSysFactory;

public class App {
    public static void main(String[] args) throws Exception {
        
        // //But here Client can see which OS are we using
        // Android test = new Android();
        // test.specs();

        OperatingSysFactory test = new OperatingSysFactory();
        OS obj = test.getInstance("Android");
        obj.specs();

    }
}
