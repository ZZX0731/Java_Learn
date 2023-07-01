package package1;

import java.util.Random;

public class arrayDemo2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        //随机打乱数组中的数据
        Random r = new Random();
        //获取数组里面的随机索引
        int number = r.nextInt(a.length);
        int temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            a[i] = a[number];
            a[number] = temp;
        }
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
