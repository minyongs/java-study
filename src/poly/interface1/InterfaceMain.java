package poly.interface1;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    test(dog);
    test(cat);

    }
    public static void test(InterfaceAnimal animal){
        System.out.println("테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("테스트 끝");
    }
}
