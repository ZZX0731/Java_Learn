package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindChar {
    public static void main(String[] args) {
        System.out.println("这是找出现次数最多的字符的函数:");
    }

    // TODO: 把我给你的函数敲在这边
    // TODO的意思是,在这里完成任务
    public static ArrayList<Character> findCharacter(String string){
        int max = 0;
        ArrayList<Character> retval = new ArrayList<>();
        // 你来
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for(int i = 0;i <string.length();++i){
            if(hashMap.containsKey(string.charAt(i))){
                int value = hashMap.get(string.charAt(i));
                value++;
                hashMap.put(string.charAt(i),value);
            }else{
                hashMap.put(string.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
            max = max > entry.getValue() ? max : entry.getValue();
        }
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            if(entry.getValue() == max){
                retval.add(entry.getKey());
            }
        }
            return retval;
        }
}
