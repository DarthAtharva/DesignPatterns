import component.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Leaf hardDisk = new Leaf(4000, "HDD");
        Leaf mouse = new Leaf(200, "Mouse");
        Leaf monitor = new Leaf(5000, "Monitor");
        Leaf ram = new Leaf(1000, "RAM");
        Leaf cpu = new Leaf(4500, "CPU");

        Composite ph = new Composite("Peripheral");
        Composite cb = new Composite("Cabinet");
        Composite mb = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        mb.addComponent(ram);
        mb.addComponent(cpu);
        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cb.addComponent(hardDisk);
        cb.addComponent(mb);
        computer.addComponent(cb);
        computer.addComponent(ph);

        computer.showPrice();
        
    }
}