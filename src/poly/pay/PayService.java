package poly.pay;

public class PayService {
    public void processPay(String option, int amount){

        boolean result;
        System.out.println("결제를 시작합니다: option = "+ option+"amount = " +amount);
        if(option.equals("kakao")){ // option이 kakao 이면
            KakaoPay kakao = new KakaoPay(); //kakao 객체 생성

            result = kakao.pay(amount); //true 반환
        }else if(option.equals("naver")){
            NaverPay naver = new NaverPay();
            result = naver.pay(amount);
        }else{
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if(result){
            System.out.println("결제가 성공했습니다.");
        }else{
            System.out.println("결제가 실패했습니다.");
        }

    }
}
