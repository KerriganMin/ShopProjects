package shop.clothes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class Cloth {
    public String name;
    public List<String> color;
    public int prise;

    Cloth(String name, List<String> color, int prise){
        this.name = name;
        this.color = color;
        this.prise = prise;
    }
}
   

