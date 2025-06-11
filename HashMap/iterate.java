import java.util.HashMap;

public class iterate {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap();
        map.put("ram",42);
        map.put("ram1",46);
        map.put("ram2",45);
        map.put("ram3",44);
        map.put("ram4",24);
        map.put("ram5",14);

        for(String key: map.keySet()){
            System.out.println(key);
        }
        for(Integer val: map.values()){
            System.out.println(val);
        }
        for(Object pair: map.entrySet()){
            System.out.println(pair);
        }
    }
    
}
