package poly.pay;

public class KakaoPay  {


    public boolean pay(int amount){ // 결제 성공과 실패를 나눠야 하기 때문에 boolean 타입 메서드
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
