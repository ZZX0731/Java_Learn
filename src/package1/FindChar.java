package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        System.out.println("这是找出现次数最多的字符的函数:");
        Scanner in = new Scanner(System.in);
        String string = in.next();
        ArrayList<Character> list = findCharacter(string); // 得到的list就是出现次数最多的那几个字符
        // 然后我输出这些字符,这个写法叫增强for循环
        for(char c:list){
            System.out.println(c+" ");
        }
    }

    /**
     *
     * @param string 判断这个字符串中哪几个字符出现的最多
     * @return 返回的是出现的最多的那几个字符
     */
    public static ArrayList<Character> findCharacter(String string) {
        int max = 0;
        ArrayList<Character> retval = new ArrayList<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < string.length(); ++i) {
            if (hashMap.containsKey(string.charAt(i))) {
                int value = hashMap.get(string.charAt(i));
                value++;
                hashMap.put(string.charAt(i), value);
            } else {
                hashMap.put(string.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            max = max > entry.getValue() ? max : entry.getValue();
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == max) {
                retval.add(entry.getKey());
            }
        }
        return retval;
    }
}
