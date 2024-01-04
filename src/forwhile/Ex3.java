package forwhile;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] products = new String[10];
        int[] productPrice = new int[10];
        int howManyProducts = 0;


        while (true){
            System.out.println("1.상품 등록");
            System.out.println("2.상품 목록");
            System.out.println("3.종료");
            System.out.println("메뉴를 선택하세요 : ");
            int pick = sc.nextInt();

            if(pick == 1){

                System.out.println("상품 이름을 입력하세요: " );
                String pn = sc.next();
                System.out.println("상품 가격을 입력하세요");
                int pp =sc.nextInt();
                howManyProducts ++;

                if(howManyProducts>1){
                    System.out.println("더이상 등록할 수 없습니다. ");
                }else {
                    products[howManyProducts] = pn;
                    productPrice[howManyProducts] = pp;// 배열에 저장
                }

                continue;
            }

            if(pick==2){
                if(howManyProducts != 0)
                for(int i = 1; i <= howManyProducts; i++ ){
                    System.out.println(products[i] + " : " + productPrice[i]+ "원");
                }else{
                    System.out.println("등록된 제품이 없습니다");
                    continue;
                }

                if(pick == 3){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }

        }

    }
}
