package Method;

public class judgeArray {
    public static void main(String[] args) {
        int[] arr = {12,33213,1412};
        int number = 12;
        boolean flag = contains(arr,number);
        System.out.println(flag);
    }
    //判断一个数字在数组中是否存在;
    public static boolean contains(int[] arr,int number){
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
