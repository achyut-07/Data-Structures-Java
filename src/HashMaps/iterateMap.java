package HashMaps;

import java.util.HashMap;

public class iterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
       
        map.put("Achyut",53);
        map.put("Raghav",76);
        map.put("Mahi",07);
        map.put("deepika",18);
        int t=map.get("Achyut");
        System.out.println(t);
        for(String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        for(int val: map.values()){
            System.out.println(val);
        }
        for(Object pair: map.entrySet()){
            System.out.println(pair);
        }
    }
}
