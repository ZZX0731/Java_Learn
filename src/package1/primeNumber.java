package package1;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (IsPrime(value))
            System.out.println("质数");
        else
            System.out.println("合数");
    }

    // 判断质数
    private static boolean IsPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
