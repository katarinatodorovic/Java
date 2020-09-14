package proba;

class Robot {
    String name;
    int age;

    void speak() {
        System.out.println("Hello my name is: " + name);
        System.out.println("And I have " + age + " years");
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {

        Robot robot1 = new Robot();
        robot1.name = "Tom";
        robot1.age = 15;
        robot1.speak();

        int age = robot1.getAge(); //get name and age is the same as void speak function
        System.out.println("(Get method) I have " + age + " years");
        String name = robot1.getName();
        System.out.println("(Get method) Hello my name is: " + name);

    }
}
