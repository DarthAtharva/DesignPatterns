package phone;

public class Phone {
    
    private String os;
    private int ramCapacity;
    private String processor;
    
    public Phone(String os, int ramCapacity, String processor) {
        this.os = os;
        this.ramCapacity = ramCapacity;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone [os=" + os + ", ramCapacity=" + ramCapacity + ", processor=" + processor + "]";
    }

    
}
