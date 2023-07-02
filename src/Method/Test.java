package Method;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*买飞机票,旺季(5~10月),头等舱9折,经济仓8.5折
        淡季(11月到来年4月),头等舱7折,经济舱6.5
        输入机票原价,月份和头等舱或经济舱
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的仓位");
        //0表示头等舱,1表示经济舱
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            getPrice(ticket, seat, 0.9, 0.85);

        } else if ((month <= 4 && month >= 1) || (month >= 11 && month <= 12)) {
            getPrice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("输入月份错误");
        }
        System.out.println(ticket);
    }

    public static int getPrice(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("没有这个仓位");
        }
        return ticket;
    }
}
