package package1;

public class changeNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int i = 0,j = a.length-1; i < j; i++,j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int j : a) {
            System.out.print(j + " ");
        }
        }
    }