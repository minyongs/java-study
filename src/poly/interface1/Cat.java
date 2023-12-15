package poly.interface1;

public class Cat implements InterfaceAnimal{


    @Override
    public void move(){
        System.out.println("고양이가 움직입니다");
    }
    public void sound(){
        System.out.println("냐옹~!");
    }
}
