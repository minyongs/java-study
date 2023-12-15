package poly.ex1;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        System.out.println("p.x =" + parent.x);
        parent.method();

        System.out.println("");

        System.out.println("c.x =" + child.x);
        child.method();
    }
}


class Parent{
    int x= 100;
    void method(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x = 200;
    void method(){
        System.out.println("x=" + x);
        System.out.println("super.x =" + super.x);
        System.out.println("this.x ="+ this.x);
    }
}
