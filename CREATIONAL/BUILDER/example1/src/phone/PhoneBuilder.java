package phone;

public class PhoneBuilder {
    
    private String os;
    private int ramCapacity;
    private String processor;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
        return this;
    }
    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    
    public Phone getPhone(){

        return new Phone(os, ramCapacity, processor);

    }
}
