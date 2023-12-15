package poly.ex1;

public class Dog extends Animal{
    //메소드 오버라이딩을 하면 무조건적인 우선권을 갖는다

    @Override
    public void soundAnimal(){
        System.out.println("멍멍");
    }
}
