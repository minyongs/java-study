package poly.ex1;

/*
다형성의 대표적인 예
Cat,Dog 클래스는 Animal으로부터 상속받음
 */

public class AnimalPolyMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        //dog 인스턴스는 animal의 자식이기 때문에 매개변수로 들어갈 수 있다
        hiAnimals(dog);
        hiAnimals(cat);





        }
        private static void hiAnimals(Animal animal){//Animal 타입을 매개변수로 받음 !
            System.out.println("동물 울음소리 테스트 시작");
            System.out.println("  ");

            animal.soundAnimal();

            System.out.println("");
            System.out.println("끄으으으읏");
    }
}
