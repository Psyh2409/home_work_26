package psyh;

import java.sql.SQLOutput;

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

        Triangle triangle1 = new Triangle(3, 4 , 5);
        Triangle triangle2 = new Triangle(2, 3 , 3.5);

        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}
