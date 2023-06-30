package package1;

import java.util.Random;

public class arrayDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int a[]= new int[10];
        int sum1 =0;
        for (int i = 0; i < a.length; i++) {
            int number = r.nextInt(100)+1;
            System.out.println("生成的随机数" + number);
            a[i] = number;
            sum1 = sum1 + number;
        }
        System.out.println(sum1);
        int avg=0;
        avg = sum1 / 10;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            int number = r.nextInt(100)+1;
            if(a[i] < avg){
                sum2++;
            }
        }
        System.out.println(avg);
        System.out.println(sum2);

    }

}
