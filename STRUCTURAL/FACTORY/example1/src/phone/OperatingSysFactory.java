package phone;

public class OperatingSysFactory {
    
    public OS getInstance(String s){

        if(s.equals("Android")){

            return new Android();
            
        }else if(s.equals("IOS")){

            return new IOS();

        }else{

            throw new IllegalArgumentException("INVALID REQUEST");

        }
    }
}
