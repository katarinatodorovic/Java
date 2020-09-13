package proba;

class Person {
    String name;
    int age;

    void speak() {
        System.out.println(name + age);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ooooo jeah! Can We be friends???Can we???Pllllleaseeee");
        }
    }

    void sayHello() {
        System.out.println("Hello There!");
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Hello I'm Joe! And I'm: ";
        person1.age = 20;
        person1.speak();
        person1.sayHello();
        // System.out.println(person1.name + person1.age);

        Person person2 = new Person();
        person2.name = "Hello I'm Jenny! And I'm: ";
        person2.age = 19;
        person2.speak();
        person2.sayHello();
        //  System.out.println(person2.name + person2.age);

    }
}
