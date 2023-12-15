package poly.abstractAnimal;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();//Dog는 AbstractAnimal 의 자식 부모는 자식을 담을수 있다 !!


        //AbstractAnmail dog = new Dog(); 역시 가능
        test(dog);


    }

    //static -> 어디서든 클래스에 직접 접근해서 사용할수 있는 메소드 잊지말자
    public static void test(AbstractAnimal animal){//추상메서드 타입의 매개변수 받음
        System.out.println("테스트 시작");

        animal.move();
        animal.sound();

        System.out.println("테스트 끝");

    }


}
