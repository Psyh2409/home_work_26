package psyh;

public class Cat {

    private final String sex;
    private String name;
    private final String color;
    private double weight;
    private int age;
    private boolean aggressive;
    private boolean sleep;

    public Cat(String sex, String name, String color, double weight, int age) {
        this.sex = sex;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
        sleep = true;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public boolean isSleep() {
        return sleep;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "sex = '" + sex + '\'' +
                ", name = '" + name + '\'' +
                ", color = '" + color + '\'' +
                ", weight = " + weight +
                ", age = " + age +
                ", aggressive = " + aggressive +
                ", sleep = " + sleep + '}';
    }

    public void voice() {
        if (!sleep) {
            if (aggressive) {
                System.out.println("SHHHHHHHHHHHHHHHHHHH");
            } else {
                System.out.println("miau-miau");
            }
        } else {
            System.out.println("mrrrrrrr");
        }
    }

    public void fallAsleep() {
        sleep = true;
        aggressive = false;
    }

    public void toAngry() {
        sleep = false;
        aggressive = true;
    }

    public void wakeUp() {
        sleep = false;
    }

    public void eating(){
        weight += 0.1;
    }

    public void happyBirthday(){
        age += 1;
    }
}
