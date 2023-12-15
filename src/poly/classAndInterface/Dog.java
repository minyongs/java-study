package poly.classAndInterface;

public abstract class Dog extends AbstractAnimal {

    @Override
    public  void sound(){
        System.out.println("멍멍");
    };


    public void move(){
        System.out.println("동물이 이동합니다.");
    }
}
