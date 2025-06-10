// package HashMap;
import java.util.*;

public class basicHashmap {
    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap();
        map.put("ram", 2);
        map.put("ram1", 21);
        map.put("ram2", 23);
        map.put("ram3", 24);
        map.put("ram4", 25);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("ram3"));
        System.out.println(map.containsValue(24));
        System.out.println(map.get("ram2"));
        map.remove("ram1");
        System.out.println(map);
    }
    
}
