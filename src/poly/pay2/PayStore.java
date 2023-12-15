package poly.pay2;

public class PayStore {

    public static Pay findPay(String option){
    if(option.equals("kakao")){
        return new KakaoPay();
    }else if(option.equals("Naver")){
        return new NaverPay();
    }else{
        return new DefaultPay();
    }
}}
