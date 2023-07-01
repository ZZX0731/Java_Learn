package package1;

import java.util.Random;

public class arrayDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            int number = r.nextInt(100) + 1;
            a[i] = number;
        }
        for (int j : a) {
            sum1 = sum1 + j;
        }
        System.out.println("所有数据的和" + sum1);
        int avg = sum1 / a.length;
        int sum2 = 0;
        for (int j : a) {
            if (j < avg) {
                sum2++;
            }
        }
        System.out.println("平均数" + avg);
        System.out.println("有" + sum2 + "个数据比平均数小");
        for (int j : a) {
            System.out.print(j + " ");
        }

    }

}
