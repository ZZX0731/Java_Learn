package package1;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int tag = 0;
        for(int i = 2;i <=Math.sqrt(a);i++){
            if(a % i == 0){
                System.out.println("合数");
                break;
            }
            tag = i;
        }
        if(tag == (int)Math.sqrt(a)){
            System.out.println("质数");
        }
    }
}
