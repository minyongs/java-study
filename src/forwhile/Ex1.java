package forwhile;

public class Ex1 {
    public static void main(String[] args) {

        int n = 0 ;
        int sum = 0;
        while(n<3){
            n++;

            sum += n;
            System.out.println("n = " + n);
            System.out.println("sum = " + sum);

        }
        System.out.println(sum);


    }
}
