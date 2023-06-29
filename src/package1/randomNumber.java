package package1;
import com.sun.javaws.IconUtil;

import java.util.Random;
public class randomNumber {
    public static void main(String[] args) {
        Random r = new Random();
        /*生成随机数的范围,一定是从0开始的;
        到(这个数-1)结束
        口诀:包头不包尾,包左不包右
         */
            int number = r.nextInt(100)+1;
            /*
            秘诀:用来生成任意数到任意数之间的随机数 1~100
            让这个范围的头尾都减去一个值,让这个范围从0开始 -1  0~99
            让尾+1  99+1=100
            最终的结果,再加上第一步减去的值
             */
            System.out.println(number);
            int tag=0;
        for (int i = 0; i <= number; i++) {
            if(i == number){
             break;
        }
            tag=i;
        }
        System.out.println(tag+1);

    }
}

