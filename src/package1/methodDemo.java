package package1;

public class methodDemo {
    public static void main(String[] args) {
        //掌握方法定义和调用格式
        int a = getS(12,22);
        int b = getS(22,22);
        if(a >b){
            System.out.println("a大");
        }else if(a == b){
            System.out.println("一样大");
        }else{
            System.out.println("b大");
        }
    }
    public static int getS(int num1, int num2){
        return num1 * num2;
    }
}
