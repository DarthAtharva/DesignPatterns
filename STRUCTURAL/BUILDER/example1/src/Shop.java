import phone.Phone;
import phone.PhoneBuilder;

public class Shop {
    public static void main(String[] args) throws Exception {
        
        // // Here we will have to remember the PARAMETERS and feed them IN ORDER
        // Phone test = new Phone("Android", 4, "Mediatek");
        // System.out.println(test);
        
        Phone test = new PhoneBuilder().setOs("IOS").setRamCapacity(16).getPhone();
        System.out.println(test);
        
    }
}
