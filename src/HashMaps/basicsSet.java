package HashMaps;

import java.util.*;

public class basicsSet {
    public static void main(String[] args) {
//        HashSet<Integer> set=new HashSet<>();
//        set.add(20);
//        set.add(100);
//        set.add(10);
//        System.out.println(set.size());
//        set.add(-8);
//        set.add(100);
//        System.out.println(set.size());
//        System.out.println(set.contains(100));
//        System.out.println(set.contains(50));
//        set.add(50);
//        System.out.println(set.size());
//        System.out.println(set.contains(50));
//        System.out.println(set);
        Map<Integer,Object> map=new TreeMap<>();
        map.put(1,null);
        map.put(2,null);
        map.put(3,null);
        map.put(4,null);
        map.put(5,null);
        System.out.println(map);

    }
    public int countPalindromicSubsequence(String s) {
        int count=0;
        HashMap<Character,Integer> fmap=new HashMap<>();
        HashMap<Character,Integer> lmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!fmap.containsKey(ch)) fmap.put(ch,i);
            lmap.put(ch,i);
        }
        for(Character key: fmap.keySet()){
            int ffreq=fmap.get(key);
            int lfreq=lmap.get(key);
            HashSet<Character> set=new HashSet<>();
            if(ffreq!=lfreq){
                for(int i=ffreq+1;i<s.length()&&i<lfreq;i++){
                    set.add(s.charAt(i));
                }
                count+=set.size();
            }
        }
        return count;

    }


}
