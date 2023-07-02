package Method;

public class Test2 {
    public static void main(String[] args) {
        //判断101~200之间有多少个质数,并输出所有质数
        for (int i = 101; i <= 200; i++) {
            primeNumber(i);
        }
    }

    public static void primeNumber(int num) {
        boolean flag = true;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                flag = false;
                //跳出单层循环,内循环
                break;
            }
        }
        if (flag) {
            System.out.println(num);
        }
    }
}
