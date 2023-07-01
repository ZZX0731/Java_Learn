package Method;

public class getArrayMax {
    public static void main(String[] args) {
        int[] arr = {1,123,42,55};
        System.out.println(getMax(arr));
    }
    //求数组中的最大值
    public static int getMax(int[] arr){
        int max = arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
        }
    }

