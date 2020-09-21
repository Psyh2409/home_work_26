package psyh;

import psyh.task_phone.Network;
import psyh.task_phone.Phone;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("male", "Tom", "black", 15, 5);
        Cat cat2 = new Cat("female", "Kitty", "white", 20, 4);
        Cat cat3 = new Cat("male", "Baster", "red", 12, 7);

        System.out.println(cat1);
        System.out.println();

        System.out.println(cat2);
        System.out.println();

        System.out.println(cat2);
        System.out.println();

        System.out.print(cat1.getName() + " sleep " + cat1.isSleep() + " and says: ");
        cat1.voice();
        System.out.println();
        cat2.wakeUp();
        System.out.print(cat2.getName() + " sleep " + cat2.isSleep() + " and says: ");
        cat2.voice();
        System.out.println();
        cat3.toAngry();
        System.out.print(cat3.getName() + " is angry " + cat3.isAggressive() + " and says: ");
        cat3.voice();
        System.out.println();

        System.out.println(cat1);
        System.out.println();

        System.out.println(cat2);
        System.out.println();

        System.out.println(cat2);
        System.out.println();

        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(2, 3, 3.5);
        Triangle triangle = new Triangle();

        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(triangle);
        System.out.println();
// Task Phone
        Network network = new Network();
        for (int i = 38066; i <= 38099; i++) {
            network.getNetwork().add(i - 38066, new Phone(i));
        }
        System.out.println("Network has Phones with numbers from 38066 to 38099");
        System.out.println();

        Phone phone1 = network.getNetwork().get(38097 - 38066); // Phone{number=83097}
        Phone phone2 = new Phone(38050);
        Phone phone3 = new Phone(38666);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();
        phone1.signUp(network);
        phone1.makeCall(phone2.getNumber());
        System.out.println();
        phone2.signUp(network);
        phone2.makeCall(phone1.getNumber());
        System.out.println();
        phone3.makeCall(phone1.getNumber());
    }
}
