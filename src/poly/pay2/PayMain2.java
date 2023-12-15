package poly.pay2;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("결제 수단을 입력하세요:");
            String payOption = sc.next();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액을 입력하세요:");
            int amount = sc.nextInt();

            // 올바른 인수를 사용하여 processPay 메서드를 호출합니다.
            payService.processPay(payOption, amount);
        }
    }
}
