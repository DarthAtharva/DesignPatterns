package component;
import java.util.ArrayList;
import java.util.List;

public class Composite implements ComputerPart{

    private String name;
    private List<ComputerPart> componentList = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(ComputerPart c){

        componentList.add(c);
    }

    @Override
    public void showPrice() {
        
        System.out.println(name);

        for(ComputerPart c : componentList)
            c.showPrice();

    }


}