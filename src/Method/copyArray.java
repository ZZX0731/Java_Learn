package Method;

public class copyArray {
    public static void main(String[] args) {
        int[] arr = {123,124,14141,3433435,2};
        int[] copyArr = copy0fRange(arr,2 , 4);
        for (int j : copyArr) {
            System.out.print(j + " ");
        }
    }
    //将数组中的(from~to)元素复制到新的数组
    public static int[] copy0fRange(int[] arr, int from,int to){
        int[] newArr = new int[to - from];
        //伪造索引的思想
        int index = 0;
        for (int i = from; i < to; i++) {
           newArr[index]  = arr[i];
           index++;
        }
        return newArr;
    }
}
