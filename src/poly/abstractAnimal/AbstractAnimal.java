package poly.abstractAnimal;

public abstract class AbstractAnimal {
    public abstract void sound();//추상 메서드가 하나 있기 때문에 추상클래스
    public  void move(){
        System.out.println("동물이 움직입니다.");//추상 클래스도 메서드 있어도된다 !
    }



}
