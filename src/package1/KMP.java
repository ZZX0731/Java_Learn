package package1;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

// 字符串的模式匹配算法
public class KMP {
    public static void main(String[] args) {
        String S = "abaababaababaabc";
        String T = "abaabc";
        System.out.println(index(S,T));
        System.out.println(kmp(S,T,getNext(T)));
        System.out.println(kmp(S,T,getNextval(T)));
    }

    // 朴素模式匹配
    public static int index(@NotNull String S, @NotNull String T){
        int i = 0;
        while(i <= S.length() - T.length()){
            if(S.startsWith(T, i))
                return i;
            else
                ++i;
        }
        return -1;
    }

    public static int kmp(@NotNull String S, String T, int[] nextval) {
        int i = 0, j = 0;
        while(i < S.length() && j < T.length()){
            if(j == -1 || S.charAt(i) == T.charAt(j)){
                ++i;
                ++j;
            }
            else{
                j = nextval[j];
            }
        }
        if(j >= T.length())
            return i - T.length();
        return -1;
    }

    // 获取模式串的next数组
    @Contract(pure = true)
    private static int @NotNull [] getNext(@NotNull String T){
        int[] next = new int[T.length()];
        int i = 0,j = -1;
        next[0] = -1;
        while(i < T.length()-1) {
            if (j == -1 || T.charAt(i) == T.charAt(j)) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }

    // 获取模式串的nextval数组,kmp的优化思路
    @Contract(pure = true)
    private static int @NotNull [] getNextval(@NotNull String T){
        int[] nextval = new int[T.length()];
        int i = 0, j = -1;
        nextval[0] = -1;
        while (i < T.length() - 1){
            if(j == -1 || T.charAt(i) == T.charAt(j)){
                ++i;
                ++j;
                if(T.charAt(i) != T.charAt(j))
                    nextval[i] = j;
                else
                    nextval[i] = nextval[j];
            }
            else{
                j = nextval[j];
            }
        }
        return nextval;
    }
}
