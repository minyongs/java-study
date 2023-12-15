package poly.abstractAnimal;

public class Dog extends AbstractAnimal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }

    @Override
    public void move(){
        System.out.println("희동이가 움직입니다.");
    }

}